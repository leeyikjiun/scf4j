/*
 * Copyright 2015 Lee Yik Jiun
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package sg.yikjiun.scf4j.set;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * @author Lee Yik Jiun
 */
public class JDKSetFactory implements SetFactoryDelegate {
    public IntSet createIntHashSet() {
        Set<Integer> set = new HashSet<Integer>();
        return new JDKIntSetAdapter(set);
    }

    public ByteSet createByteHashSet() {
        Set<Byte> set = new HashSet<Byte>();
        return new JDKByteSetAdapter(set);
    }

    public ShortSet createShortHashSet() {
        Set<Short> set = new HashSet<Short>();
        return new JDKShortSetAdapter(set);
    }

    public LongSet createLongHashSet() {
        Set<Long> set = new HashSet<Long>();
        return new JDKLongSetAdapter(set);
    }

    public DoubleSet createDoubleHashSet() {
        Set<Double> set = new HashSet<Double>();
        return new JDKDoubleSetAdapter(set);
    }

    public FloatSet createFloatHashSet() {
        Set<Float> set = new HashSet<Float>();
        return new JDKFloatSetAdapter(set);
    }

    public CharSet createCharHashSet() {
        Set<Character> set = new HashSet<Character>();
        return new JDKCharSetAdapter(set);
    }

    public BooleanSet createBooleanHashSet() {
        Set<Boolean> set = new HashSet<Boolean>();
        return new JDKBooleanSetAdapter(set);
    }

    public IntSet createIntTreeSet() {
        Set<Integer> set = new TreeSet<Integer>();
        return new JDKIntSetAdapter(set);
    }

    public ByteSet createByteTreeSet() {
        Set<Byte> set = new TreeSet<Byte>();
        return new JDKByteSetAdapter(set);
    }

    public ShortSet createShortTreeSet() {
        Set<Short> set = new TreeSet<Short>();
        return new JDKShortSetAdapter(set);
    }

    public LongSet createLongTreeSet() {
        Set<Long> set = new TreeSet<Long>();
        return new JDKLongSetAdapter(set);
    }

    public DoubleSet createDoubleTreeSet() {
        Set<Double> set = new TreeSet<Double>();
        return new JDKDoubleSetAdapter(set);
    }

    public FloatSet createFloatTreeSet() {
        Set<Float> set = new TreeSet<Float>();
        return new JDKFloatSetAdapter(set);
    }

    public CharSet createCharTreeSet() {
        Set<Character> set = new TreeSet<Character>();
        return new JDKCharSetAdapter(set);
    }

    public BooleanSet createBooleanTreeSet() {
        Set<Boolean> set = new TreeSet<Boolean>();
        return new JDKBooleanSetAdapter(set);
    }
}
