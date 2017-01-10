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
package org.apache.solr.search;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.queryparser.xml.ParserException;
import org.apache.lucene.queryparser.xml.QueryBuilder;
import org.apache.lucene.queryparser.xml.builders.SpanQueryBuilder;
import org.apache.lucene.search.spans.SpanQuery;
import org.apache.solr.request.SolrQueryRequest;
import org.w3c.dom.Element;

public abstract class SolrQueryBuilder implements QueryBuilder, SpanQueryBuilder {

  protected final SolrQueryRequest req;
  protected final QueryBuilder queryFactory;
  protected final SpanQueryBuilder spanFactory;

  @Deprecated
  public SolrQueryBuilder(String defaultField, Analyzer analyzer,
      SolrQueryRequest req, QueryBuilder queryFactory) {
    this(defaultField, analyzer, req, queryFactory, null);
  }

  public SolrQueryBuilder(String defaultField, Analyzer analyzer,
      SolrQueryRequest req, QueryBuilder queryFactory, SpanQueryBuilder spanFactory) {
    super();
    this.req = req;
    this.queryFactory = queryFactory;
    this.spanFactory = spanFactory;
  }

  @Override
  public SpanQuery getSpanQuery(Element e) throws ParserException {
    return null;
  }

}
