/**
 * Copyright 2016, wizonsoft, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.github.wizonsoft.common.logging;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.github.wizonsoft.common.exception.InternalError;

/**
 * @author wasiq.bhamla
 * @since 04-Nov-2016 8:48:34 PM
 */
public class SimpleLogger {
	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 9:32:20 PM
	 * @return instance
	 */
	public static SimpleLogger create () {
		return new SimpleLogger ();
	}

	private StackTraceElement []	caller;
	private Logger					logger;

	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 8:48:35 PM
	 */
	private SimpleLogger () {
		initLogger ();
		parseCaller ();
	}

	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 9:09:07 PM
	 * @param message
	 * @param args
	 */
	public void debug (final String message, final Object... args) {
		this.logger.debug (String.format (message, args));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 9:07:52 PM
	 * @param message
	 * @param args
	 */
	public void error (final String message, final Object... args) {
		this.logger.error (String.format (message, args));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 9:08:10 PM
	 * @param message
	 * @param args
	 */
	public void fatal (final String message, final Object... args) {
		this.logger.fatal (String.format (message, args));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 9:06:57 PM
	 * @param message
	 * @param args
	 */
	public void info (final String message, final Object... args) {
		this.logger.info (String.format (message, args));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 9:09:19 PM
	 * @param message
	 * @param args
	 */
	public void trace (final String message, final Object... args) {
		this.logger.trace (String.format (message, args));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 9:07:29 PM
	 * @param message
	 * @param args
	 */
	public void warn (final String message, final Object... args) {
		this.logger.warn (String.format (message, args));
	}

	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 8:51:51 PM
	 */
	private void initLogger () {
		final Throwable source = new Throwable ();
		this.caller = source.getStackTrace ();
	}

	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 8:50:54 PM
	 */
	private void parseCaller () {
		for (final StackTraceElement element : this.caller) {
			final String cls = element.getClassName ();
			if (cls.equals (SimpleLogger.class.getName ())) {
				continue;
			}
			try {
				this.logger = LogManager.getLogger (Class.forName (cls));
				break;
			}
			catch (final ClassNotFoundException e) {
				try {
					throw new InternalError ("SimpleLogger.parseCaller", e);
				}
				catch (final InternalError e1) {
					this.logger = LogManager.getLogger (SimpleLogger.class);
					this.logger.catching (e1);
				}
			}
		}
	}
}