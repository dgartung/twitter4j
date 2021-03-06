/*
 * Copyright 2007 Yusuke Yamamoto
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package twitter4j.internal.logging;

/**
 * @author Yusuke Yamamoto - yusuke at mac.com
 * @since Twitter4J 2.1.1
 */
final class Log4JLogger extends Logger {
    private final org.apache.log4j.Logger LOGGER;

    Log4JLogger(org.apache.log4j.Logger logger) {
        LOGGER = logger;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isDebugEnabled() {
        return LOGGER.isDebugEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isInfoEnabled() {
        return LOGGER.isInfoEnabled();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean isWarnEnabled() {
        return LOGGER.isEnabledFor(org.apache.log4j.Level.WARN);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void debug(String message) {
        LOGGER.debug(message);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void debug(String message, String message2) {
        debug(message + message2);
    }

    /**
     * {@inheritDoc}
     */
    public void info(String message) {
        LOGGER.info(message);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void info(String message, String message2) {
        info(message + message2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void warn(String message) {
        LOGGER.warn(message);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public void warn(String message, String message2) {
        warn(message + message2);
    }
}
