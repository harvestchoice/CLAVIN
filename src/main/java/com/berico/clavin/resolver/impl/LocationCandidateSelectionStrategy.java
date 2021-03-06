package com.berico.clavin.resolver.impl;

import java.util.Collection;
import java.util.List;

import com.berico.clavin.Options;
import com.berico.clavin.extractor.CoordinateOccurrence;
import com.berico.clavin.resolver.ResolvedLocation;

/*#####################################################################
 * 
 * CLAVIN (Cartographic Location And Vicinity INdexer)
 * ---------------------------------------------------
 * 
 * Copyright (C) 2012-2013 Berico Technologies
 * http://clavin.bericotechnologies.com
 * 
 * ====================================================================
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 * 		http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 * implied. See the License for the specific language governing
 * permissions and limitations under the License.
 * 
 * ====================================================================
 * 
 * LocationCandidateSelectionStrategy.java
 * 
 *###################################################################*/

/**
 * Defines the requirements of the Selection mechanism for choosing the
 * best ResolvedLocation candidate from the set of candidate locations
 * provided to the strategy.
 */
public interface LocationCandidateSelectionStrategy {
	
	/**
	 * Given a set of ResolvedLocations (for each location extracted in the
	 * document), pick the best one.  The set of coordinates that also
	 * occurred in the document are provided to assist the strategy in selection.
	 * @param allPossibilities Location candidates to choose from.
	 * @param cooccurringCoordinates Coordinates that co-occurred in the document.
	 * @param options Options to help configure the SelectionStrategy
	 * @return Best candidate selections.
	 * @throws Exception
	 */
	List<ResolvedLocation> select(
		List<List<ResolvedLocation>> allPossibilities,
		Collection<CoordinateOccurrence<?>> cooccurringCoordinates,
		Options options) throws Exception;
}
