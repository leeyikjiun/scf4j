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

import it.unimi.dsi.fastutil.booleans.BooleanOpenHashSet;
import it.unimi.dsi.fastutil.bytes.ByteOpenHashSet;
import it.unimi.dsi.fastutil.bytes.ByteRBTreeSet;
import it.unimi.dsi.fastutil.chars.CharOpenHashSet;
import it.unimi.dsi.fastutil.chars.CharRBTreeSet;
import it.unimi.dsi.fastutil.doubles.DoubleOpenHashSet;
import it.unimi.dsi.fastutil.doubles.DoubleRBTreeSet;
import it.unimi.dsi.fastutil.floats.FloatOpenHashSet;
import it.unimi.dsi.fastutil.floats.FloatRBTreeSet;
import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import it.unimi.dsi.fastutil.ints.IntRBTreeSet;
import it.unimi.dsi.fastutil.longs.LongOpenHashSet;
import it.unimi.dsi.fastutil.longs.LongRBTreeSet;
import it.unimi.dsi.fastutil.shorts.ShortOpenHashSet;
import it.unimi.dsi.fastutil.shorts.ShortRBTreeSet;

/**
 * @author Lee Yik Jiun
 */
public class FastUtilSetFactory implements SetFactoryDelegate {
    public IntSet createIntHashSet() {
        it.unimi.dsi.fastutil.ints.IntSet set = new IntOpenHashSet();
        return new FastUtilIntSetAdapter(set);
    }

    public ByteSet createByteHashSet() {
        it.unimi.dsi.fastutil.bytes.ByteSet set = new ByteOpenHashSet();
        return new FastUtilByteSetAdapter(set);
    }

    public ShortSet createShortHashSet() {
        it.unimi.dsi.fastutil.shorts.ShortSet set = new ShortOpenHashSet();
        return new FastUtilShortSetAdapter(set);
    }

    public LongSet createLongHashSet() {
        it.unimi.dsi.fastutil.longs.LongSet set = new LongOpenHashSet();
        return new FastUtilLongSetAdapter(set);
    }

    public DoubleSet createDoubleHashSet() {
        it.unimi.dsi.fastutil.doubles.DoubleSet set = new DoubleOpenHashSet();
        return new FastUtilDoubleSetAdapter(set);
    }

    public FloatSet createFloatHashSet() {
        it.unimi.dsi.fastutil.floats.FloatSet set = new FloatOpenHashSet();
        return new FastUtilFloatSetAdapter(set);
    }

    public CharSet createCharHashSet() {
        it.unimi.dsi.fastutil.chars.CharSet set = new CharOpenHashSet();
        return new FastUtilCharSetAdapter(set);
    }

    public BooleanSet createBooleanHashSet() {
        it.unimi.dsi.fastutil.booleans.BooleanSet set = new BooleanOpenHashSet();
        return new FastUtilBooleanSetAdapter(set);
    }

    public IntSet createIntTreeSet() {
        it.unimi.dsi.fastutil.ints.IntSet set = new IntRBTreeSet();
        return new FastUtilIntSetAdapter(set);
    }

    public ByteSet createByteTreeSet() {
        it.unimi.dsi.fastutil.bytes.ByteSet set = new ByteRBTreeSet();
        return new FastUtilByteSetAdapter(set);
    }

    public ShortSet createShortTreeSet() {
        it.unimi.dsi.fastutil.shorts.ShortSet set = new ShortRBTreeSet();
        return new FastUtilShortSetAdapter(set);
    }

    public LongSet createLongTreeSet() {
        it.unimi.dsi.fastutil.longs.LongSet set = new LongRBTreeSet();
        return new FastUtilLongSetAdapter(set);
    }

    public DoubleSet createDoubleTreeSet() {
        it.unimi.dsi.fastutil.doubles.DoubleSet set = new DoubleRBTreeSet();
        return new FastUtilDoubleSetAdapter(set);
    }

    public FloatSet createFloatTreeSet() {
        it.unimi.dsi.fastutil.floats.FloatSet set = new FloatRBTreeSet();
        return new FastUtilFloatSetAdapter(set);
    }

    public CharSet createCharTreeSet() {
        it.unimi.dsi.fastutil.chars.CharSet set = new CharRBTreeSet();
        return new FastUtilCharSetAdapter(set);
    }

    public BooleanSet createBooleanTreeSet() {
        throw new UnsupportedOperationException("Fast Util does not support boolean tree set");
    }
}
