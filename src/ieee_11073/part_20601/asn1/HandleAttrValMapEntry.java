/*
Copyright (C) 2011 GSyC/LibreSoft, Universidad Rey Juan Carlos.

Author: Jose Antonio Santos Cadenas <jcaden@libresoft.es>
Author: Santiago Carot-Nemesio <scarot@libresoft.es>

This program is a (FLOS) free libre and open source implementation
of a multiplatform manager device written in java according to the
ISO/IEEE 11073-20601. Manager application is designed to work in
DalvikVM over android platform.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU General Public License for more details.

You should have received a copy of the GNU General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.

*/

package ieee_11073.part_20601.asn1;
//
// This file was generated by the BinaryNotes compiler.
// See http://bnotes.sourceforge.net
// Any modifications to this file will be lost upon recompilation of the source ASN.1.
//

import org.bn.*;
import org.bn.annotations.*;
import org.bn.annotations.constraints.*;
import org.bn.coders.*;
import org.bn.types.*;




    @ASN1PreparedElement
    @ASN1Sequence ( name = "HandleAttrValMapEntry", isSet = false )
    public class HandleAttrValMapEntry implements IASN1PreparedElement {

        @ASN1Element ( name = "obj-handle", isOptional =  false , hasTag =  false  , hasDefaultValue =  false, hasExplicitOrder = true, declarationOrder = 0  )

	private HANDLE obj_handle = null;


        @ASN1Element ( name = "attr-val-map", isOptional =  false , hasTag =  false  , hasDefaultValue =  false, hasExplicitOrder = true, declarationOrder = 1  )

	private AttrValMap attr_val_map = null;



        public HANDLE getObj_handle () {
            return this.obj_handle;
        }



        public void setObj_handle (HANDLE value) {
            this.obj_handle = value;
        }



        public AttrValMap getAttr_val_map () {
            return this.attr_val_map;
        }



        public void setAttr_val_map (AttrValMap value) {
            this.attr_val_map = value;
        }




        public void initWithDefaults() {

        }

        private static IASN1PreparedElementData preparedData = CoderFactory.getInstance().newPreparedElementData(HandleAttrValMapEntry.class);
        public IASN1PreparedElementData getPreparedData() {
            return preparedData;
        }


    }
