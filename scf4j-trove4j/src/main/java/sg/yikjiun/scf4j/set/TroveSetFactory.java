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

import gnu.trove.set.*;
import gnu.trove.set.hash.*;

/**
 * @author Lee Yik Jiun
 */
public class TroveSetFactory implements SetFactoryDelegate {
    public IntSet createIntHashSet() {
        TIntSet set = new TIntHashSet();
        return new TroveIntSetAdapter(set);
    }

    public ByteSet createByteHashSet() {
        TByteSet set = new TByteHashSet();
        return new TroveByteSetAdapter(set);
    }

    public ShortSet createShortHashSet() {
        TShortSet set = new TShortHashSet();
        return new TroveShortSetAdapter(set);
    }

    public LongSet createLongHashSet() {
        TLongSet set = new TLongHashSet();
        return new TroveLongSetAdapter(set);
    }

    public DoubleSet createDoubleHashSet() {
        TDoubleSet set = new TDoubleHashSet();
        return new TroveDoubleSetAdapter(set);
    }

    public FloatSet createFloatHashSet() {
        TFloatSet set = new TFloatHashSet();
        return new TroveFloatSetAdapter(set);
    }

    public CharSet createCharHashSet() {
        TCharSet set = new TCharHashSet();
        return new TroveCharSetAdapter(set);
    }

    public BooleanSet createBooleanHashSet() {
        throw new UnsupportedOperationException("Trove does not support boolean set");
    }

    public IntSet createIntTreeSet() {
        throw new UnsupportedOperationException("Trove does not support tree sets");
    }

    public ByteSet createByteTreeSet() {
        throw new UnsupportedOperationException("Trove does not support tree sets");
    }

    public ShortSet createShortTreeSet() {
        throw new UnsupportedOperationException("Trove does not support tree sets");
    }

    public LongSet createLongTreeSet() {
        throw new UnsupportedOperationException("Trove does not support tree sets");
    }

    public DoubleSet createDoubleTreeSet() {
        throw new UnsupportedOperationException("Trove does not support tree sets");
    }

    public FloatSet createFloatTreeSet() {
        throw new UnsupportedOperationException("Trove does not support tree sets");
    }

    public CharSet createCharTreeSet() {
        throw new UnsupportedOperationException("Trove does not support tree sets");
    }

    public BooleanSet createBooleanTreeSet() {
        throw new UnsupportedOperationException("Trove does not support boolean set");
    }
}
