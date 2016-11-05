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
package com.github.wizonsoft.common.exception;

import com.github.wizonsoft.common.enums.ExceptionCategory;
import com.github.wizonsoft.common.enums.ExceptionSeverity;

/**
 * @author wasiq.bhamla
 * @since 05-Nov-2016 4:07:47 PM
 */
public class DefaultError extends AssertionError {
	private static final long			serialVersionUID	= 1373401304473164998L;
	protected final ExceptionCategory	category;
	protected final ExceptionSeverity	severity;

	/**
	 * @author wasiq.bhamla
	 * @since 05-Nov-2016 4:10:04 PM
	 * @param category
	 * @param severity
	 * @param message
	 * @param cause
	 */
	public DefaultError (final ExceptionCategory category, final ExceptionSeverity severity, final String message,
			final Throwable cause) {
		super (message, cause);
		this.category = category;
		this.severity = severity;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 05-Nov-2016 4:10:13 PM
	 * @return the category
	 */
	public ExceptionCategory getCategory () {
		return this.category;
	}

	/**
	 * @author wasiq.bhamla
	 * @since 05-Nov-2016 4:10:13 PM
	 * @return the severity
	 */
	public ExceptionSeverity getSeverity () {
		return this.severity;
	}
}