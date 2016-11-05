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
 * @since 05-Nov-2016 4:13:23 PM
 */
public class IncorrectComputationError extends DefaultError {
	private static final long serialVersionUID = 4887496828596271450L;

	/**
	 * @author wasiq.bhamla
	 * @since 05-Nov-2016 4:16:30 PM
	 * @param severity
	 * @param message
	 * @param cause
	 */
	public IncorrectComputationError (final ExceptionSeverity severity, final String message, final Throwable cause) {
		super (ExceptionCategory.COMPUTATION, severity, message, cause);
	}

	/**
	 * @author wasiq.bhamla
	 * @since 05-Nov-2016 4:13:23 PM
	 * @param message
	 * @param cause
	 */
	public IncorrectComputationError (final String message, final Throwable cause) {
		super (ExceptionCategory.COMPUTATION, ExceptionSeverity.HIGH, message, cause);
	}
}