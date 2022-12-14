/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.lucene.analysis.fa;

import java.util.Map;
import org.apache.lucene.analysis.TokenFilterFactory;
import org.apache.lucene.analysis.TokenStream;

/**
 * Factory for {@link PersianStemFilter}.
 *
 * @since 9.2
 * @lucene.spi {@value #NAME}
 */
public class PersianStemFilterFactory extends TokenFilterFactory {

  /** SPI name */
  public static final String NAME = "persianStem";

  /** Creates a new PersianStemFilterFactory */
  public PersianStemFilterFactory(Map<String, String> args) {
    super(args);
    if (!args.isEmpty()) {
      throw new IllegalArgumentException("Unknown parameters: " + args);
    }
  }

  /** Default ctor for compatibility with SPI */
  public PersianStemFilterFactory() {
    throw defaultCtorException();
  }

  @Override
  public PersianStemFilter create(TokenStream input) {
    return new PersianStemFilter(input);
  }
}
