/*

    ngs-fca  Formal concept analysis for genomics.
    Copyright (c) 2014-2015 National Marrow Donor Program (NMDP)

    This library is free software; you can redistribute it and/or modify it
    under the terms of the GNU Lesser General Public License as published
    by the Free Software Foundation; either version 3 of the License, or (at
    your option) any later version.

    This library is distributed in the hope that it will be useful, but WITHOUT
    ANY WARRANTY; with out even the implied warranty of MERCHANTABILITY or
    FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public
    License for more details.

    You should have received a copy of the GNU Lesser General Public License
    along with this library;  if not, write to the Free Software Foundation,
    Inc., 59 Temple Place, Suite 330, Boston, MA 02111-1307  USA.

    > http://www.gnu.org/licenses/lgpl.html

*/
package org.nmdp.ngs.fca;

import java.util.List;

/**
 * Context.
 */
// todo:  should the lists in this interface be typed?
public interface Context extends Lattice<Concept> {
    List getObjects();
    List getAttributes();
    @Override
    Concept bottom();
    @Override
    Concept top();
    @Override
    Concept join(Concept left, Concept right);
    @Override
    Concept meet(Concept left, Concept right);   
    
    Concept greatestLowerBound(List query);
    Concept leastUpperBound(List query);

    double marginal(List query);
    double conditional(List left, List right);
}