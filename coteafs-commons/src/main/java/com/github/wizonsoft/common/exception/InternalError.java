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
 * @since 04-Nov-2016 9:21:28 PM
 */
public class InternalError extends DefaultError {
	private static final long serialVersionUID = 4528827716667471378L;

	/**
	 * @author wasiq.bhamla
	 * @since 05-Nov-2016 4:15:54 PM
	 * @param severity
	 * @param message
	 * @param cause
	 */
	public InternalError (final ExceptionSeverity severity, final String message, final Throwable cause) {
		super (ExceptionCategory.INTERNAL, severity, message, cause);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 9:25:22 PM
	 * @param message
	 * @param cause
	 */
	public InternalError (final String message, final Throwable cause) {
		super (ExceptionCategory.INTERNAL, ExceptionSeverity.HIGH, message, cause);
	}
}