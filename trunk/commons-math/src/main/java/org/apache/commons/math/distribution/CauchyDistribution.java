/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.commons.math.distribution;

/**
 * Cauchy Distribution.
 *
 * <p>
 * References:
 * <ul>
 *  <li><a href="http://mathworld.wolfram.com/CauchyDistribution.html">
 *   Cauchy Distribution</a>
 *  </li>
 * </ul>
 * </p>
 *
 * @since 1.1
 * @version $Revision: 1003048 $ $Date: 2010-09-30 14:55:02 +0200 (Do, 30 Sep 2010) $
 */
public interface CauchyDistribution extends ContinuousDistribution {
    /**
     * Access the median.
     *
     * @return the median for this distribution.
     */
    double getMedian();

    /**
     * Access the scale parameter.
     *
     * @return the scale parameter for this distribution.
     */
    double getScale();
}
