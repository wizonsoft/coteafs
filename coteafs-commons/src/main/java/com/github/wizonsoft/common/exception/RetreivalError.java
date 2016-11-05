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
 * @since 05-Nov-2016 5:04:54 PM
 */
public class RetreivalError extends DefaultError {
	private static final long serialVersionUID = 689549150839396739L;

	/**
	 * @author wasiq.bhamla
	 * @since 05-Nov-2016 5:04:54 PM
	 * @param severity
	 * @param message
	 * @param cause
	 */
	public RetreivalError (final ExceptionSeverity severity, final String message, final Throwable cause) {
		super (ExceptionCategory.RETRIEVAL, severity, message, cause);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 05-Nov-2016 5:05:54 PM
	 * @param message
	 * @param cause
	 */
	public RetreivalError (final String message, final Throwable cause) {
		super (ExceptionCategory.RETRIEVAL, ExceptionSeverity.HIGH, message, cause);
	}
}