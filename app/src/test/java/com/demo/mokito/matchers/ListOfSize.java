/*
 *  Copyright 2016 Jeroen Mols
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *  http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.demo.mokito.matchers;

import org.mockito.ArgumentMatcher;

import java.util.List;


public class ListOfSize extends ArgumentMatcher<List> {

    private final int size;
    private int actualSize;

    public ListOfSize(int size) {
        this.size = size;
    }



    public String toString() {
        //printed in verification errors
        return String.format("[list has wrong size: expected %d, actual %d]", size, actualSize);
    }


    @Override
    public boolean matches(Object list) {

        actualSize = ((List)list).size();
        return actualSize == size;
    }
}
