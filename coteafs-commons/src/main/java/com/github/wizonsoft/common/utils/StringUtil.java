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
package com.github.wizonsoft.common.utils;

import org.apache.commons.lang3.StringUtils;

/**
 * @author wasiq.bhamla
 * @since 04-Nov-2016 9:00:11 PM
 */
public final class StringUtil extends StringUtils {
	/**
	 * @author wasiq.bhamla
	 * @since 04-Nov-2016 9:06:08 PM
	 * @param message
	 * @param args
	 * @return Formatted String.
	 */
	public static String format (final String message, final Object... args) {
		return String.format (message, args);
	}
}