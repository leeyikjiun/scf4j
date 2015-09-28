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

package sg.yikjiun.scf4j.map;

import gnu.trove.map.*;
import gnu.trove.map.hash.*;

/**
 * @author Lee Yik Jiun
 */
public class TroveMapFactory implements MapFactoryDelegate {
    public ByteByteMap createByteByteHashMap() {
        TByteByteMap map = new TByteByteHashMap();
        return new TroveByteByteMapAdapter(map);
    }

    public ByteBooleanMap createByteBooleanHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public ByteShortMap createByteShortHashMap() {
        TByteShortMap map = new TByteShortHashMap();
        return new TroveByteShortMapAdapter(map);
    }

    public ByteIntMap createByteIntHashMap() {
        TByteIntMap map = new TByteIntHashMap();
        return new TroveByteIntMapAdapter(map);
    }

    public ByteLongMap createByteLongHashMap() {
        TByteLongMap map = new TByteLongHashMap();
        return new TroveByteLongMapAdapter(map);
    }

    public ByteDoubleMap createByteDoubleHashMap() {
        TByteDoubleMap map = new TByteDoubleHashMap();
        return new TroveByteDoubleMapAdapter(map);
    }

    public ByteFloatMap createByteFloatHashMap() {
        TByteFloatMap map = new TByteFloatHashMap();
        return new TroveByteFloatMapAdapter(map);
    }

    public ByteCharMap createByteCharHashMap() {
        TByteCharMap map = new TByteCharHashMap();
        return new TroveByteCharMapAdapter(map);
    }

    public BooleanByteMap createBooleanByteHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public BooleanBooleanMap createBooleanBooleanHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public BooleanShortMap createBooleanShortHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public BooleanIntMap createBooleanIntHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public BooleanLongMap createBooleanLongHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public BooleanDoubleMap createBooleanDoubleHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public BooleanFloatMap createBooleanFloatHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public BooleanCharMap createBooleanCharHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public ShortByteMap createShortByteHashMap() {
        TShortByteMap map = new TShortByteHashMap();
        return new TroveShortByteMapAdapter(map);
    }

    public ShortBooleanMap createShortBooleanHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public ShortShortMap createShortShortHashMap() {
        TShortShortMap map = new TShortShortHashMap();
        return new TroveShortShortMapAdapter(map);
    }

    public ShortIntMap createShortIntHashMap() {
        TShortIntMap map = new TShortIntHashMap();
        return new TroveShortIntMapAdapter(map);
    }

    public ShortLongMap createShortLongHashMap() {
        TShortLongMap map = new TShortLongHashMap();
        return new TroveShortLongMapAdapter(map);
    }

    public ShortDoubleMap createShortDoubleHashMap() {
        TShortDoubleMap map = new TShortDoubleHashMap();
        return new TroveShortDoubleMapAdapter(map);
    }

    public ShortFloatMap createShortFloatHashMap() {
        TShortFloatMap map = new TShortFloatHashMap();
        return new TroveShortFloatMapAdapter(map);
    }

    public ShortCharMap createShortCharHashMap() {
        TShortCharMap map = new TShortCharHashMap();
        return new TroveShortCharMapAdapter(map);
    }

    public IntByteMap createIntByteHashMap() {
        TIntByteMap map = new TIntByteHashMap();
        return new TroveIntByteMapAdapter(map);
    }

    public IntBooleanMap createIntBooleanHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public IntShortMap createIntShortHashMap() {
        TIntShortMap map = new TIntShortHashMap();
        return new TroveIntShortMapAdapter(map);
    }

    public IntIntMap createIntIntHashMap() {
        TIntIntMap map = new TIntIntHashMap();
        return new TroveIntIntMapAdapter(map);
    }

    public IntLongMap createIntLongHashMap() {
        TIntLongMap map = new TIntLongHashMap();
        return new TroveIntLongMapAdapter(map);
    }

    public IntDoubleMap createIntDoubleHashMap() {
        TIntDoubleMap map = new TIntDoubleHashMap();
        return new TroveIntDoubleMapAdapter(map);
    }

    public IntFloatMap createIntFloatHashMap() {
        TIntFloatMap map = new TIntFloatHashMap();
        return new TroveIntFloatMapAdapter(map);
    }

    public IntCharMap createIntCharHashMap() {
        TIntCharMap map = new TIntCharHashMap();
        return new TroveIntCharMapAdapter(map);
    }

    public LongByteMap createLongByteHashMap() {
        TLongByteMap map = new TLongByteHashMap();
        return new TroveLongByteMapAdapter(map);
    }

    public LongBooleanMap createLongBooleanHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public LongShortMap createLongShortHashMap() {
        TLongShortMap map = new TLongShortHashMap();
        return new TroveLongShortMapAdapter(map);
    }

    public LongIntMap createLongIntHashMap() {
        TLongIntMap map = new TLongIntHashMap();
        return new TroveLongIntMapAdapter(map);
    }

    public LongLongMap createLongLongHashMap() {
        TLongLongMap map = new TLongLongHashMap();
        return new TroveLongLongMapAdapter(map);
    }

    public LongDoubleMap createLongDoubleHashMap() {
        TLongDoubleMap map = new TLongDoubleHashMap();
        return new TroveLongDoubleMapAdapter(map);
    }

    public LongFloatMap createLongFloatHashMap() {
        TLongFloatMap map = new TLongFloatHashMap();
        return new TroveLongFloatMapAdapter(map);
    }

    public LongCharMap createLongCharHashMap() {
        TLongCharMap map = new TLongCharHashMap();
        return new TroveLongCharMapAdapter(map);
    }

    public DoubleByteMap createDoubleByteHashMap() {
        TDoubleByteMap map = new TDoubleByteHashMap();
        return new TroveDoubleByteMapAdapter(map);
    }

    public DoubleBooleanMap createDoubleBooleanHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public DoubleShortMap createDoubleShortHashMap() {
        TDoubleShortMap map = new TDoubleShortHashMap();
        return new TroveDoubleShortMapAdapter(map);
    }

    public DoubleIntMap createDoubleIntHashMap() {
        TDoubleIntMap map = new TDoubleIntHashMap();
        return new TroveDoubleIntMapAdapter(map);
    }

    public DoubleLongMap createDoubleLongHashMap() {
        TDoubleLongMap map = new TDoubleLongHashMap();
        return new TroveDoubleLongMapAdapter(map);
    }

    public DoubleDoubleMap createDoubleDoubleHashMap() {
        TDoubleDoubleMap map = new TDoubleDoubleHashMap();
        return new TroveDoubleDoubleMapAdapter(map);
    }

    public DoubleFloatMap createDoubleFloatHashMap() {
        TDoubleFloatMap map = new TDoubleFloatHashMap();
        return new TroveDoubleFloatMapAdapter(map);
    }

    public DoubleCharMap createDoubleCharHashMap() {
        TDoubleCharMap map = new TDoubleCharHashMap();
        return new TroveDoubleCharMapAdapter(map);
    }

    public FloatByteMap createFloatByteHashMap() {
        TFloatByteMap map = new TFloatByteHashMap();
        return new TroveFloatByteMapAdapter(map);
    }

    public FloatBooleanMap createFloatBooleanHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public FloatShortMap createFloatShortHashMap() {
        TFloatShortMap map = new TFloatShortHashMap();
        return new TroveFloatShortMapAdapter(map);
    }

    public FloatIntMap createFloatIntHashMap() {
        TFloatIntMap map = new TFloatIntHashMap();
        return new TroveFloatIntMapAdapter(map);
    }

    public FloatLongMap createFloatLongHashMap() {
        TFloatLongMap map = new TFloatLongHashMap();
        return new TroveFloatLongMapAdapter(map);
    }

    public FloatDoubleMap createFloatDoubleHashMap() {
        TFloatDoubleMap map = new TFloatDoubleHashMap();
        return new TroveFloatDoubleMapAdapter(map);
    }

    public FloatFloatMap createFloatFloatHashMap() {
        TFloatFloatMap map = new TFloatFloatHashMap();
        return new TroveFloatFloatMapAdapter(map);
    }

    public FloatCharMap createFloatCharHashMap() {
        TFloatCharMap map = new TFloatCharHashMap();
        return new TroveFloatCharMapAdapter(map);
    }

    public CharByteMap createCharByteHashMap() {
        TCharByteMap map = new TCharByteHashMap();
        return new TroveCharByteMapAdapter(map);
    }

    public CharBooleanMap createCharBooleanHashMap() {
        throw new UnsupportedOperationException("Trove does not support boolean map");
    }

    public CharShortMap createCharShortHashMap() {
        TCharShortMap map = new TCharShortHashMap();
        return new TroveCharShortMapAdapter(map);
    }

    public CharIntMap createCharIntHashMap() {
        TCharIntMap map = new TCharIntHashMap();
        return new TroveCharIntMapAdapter(map);
    }

    public CharLongMap createCharLongHashMap() {
        TCharLongMap map = new TCharLongHashMap();
        return new TroveCharLongMapAdapter(map);
    }

    public CharDoubleMap createCharDoubleHashMap() {
        TCharDoubleMap map = new TCharDoubleHashMap();
        return new TroveCharDoubleMapAdapter(map);
    }

    public CharFloatMap createCharFloatHashMap() {
        TCharFloatMap map = new TCharFloatHashMap();
        return new TroveCharFloatMapAdapter(map);
    }

    public CharCharMap createCharCharHashMap() {
        TCharCharMap map = new TCharCharHashMap();
        return new TroveCharCharMapAdapter(map);
    }

    public ByteByteMap createByteByteTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ByteBooleanMap createByteBooleanTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ByteShortMap createByteShortTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ByteIntMap createByteIntTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ByteLongMap createByteLongTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ByteDoubleMap createByteDoubleTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ByteFloatMap createByteFloatTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ByteCharMap createByteCharTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public BooleanByteMap createBooleanByteTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public BooleanBooleanMap createBooleanBooleanTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public BooleanShortMap createBooleanShortTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public BooleanIntMap createBooleanIntTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public BooleanLongMap createBooleanLongTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public BooleanDoubleMap createBooleanDoubleTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public BooleanFloatMap createBooleanFloatTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public BooleanCharMap createBooleanCharTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ShortByteMap createShortByteTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ShortBooleanMap createShortBooleanTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ShortShortMap createShortShortTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ShortIntMap createShortIntTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ShortLongMap createShortLongTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ShortDoubleMap createShortDoubleTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ShortFloatMap createShortFloatTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public ShortCharMap createShortCharTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public IntByteMap createIntByteTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public IntBooleanMap createIntBooleanTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public IntShortMap createIntShortTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public IntIntMap createIntIntTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public IntLongMap createIntLongTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public IntDoubleMap createIntDoubleTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public IntFloatMap createIntFloatTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public IntCharMap createIntCharTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public LongByteMap createLongByteTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public LongBooleanMap createLongBooleanTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public LongShortMap createLongShortTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public LongIntMap createLongIntTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public LongLongMap createLongLongTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public LongDoubleMap createLongDoubleTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public LongFloatMap createLongFloatTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public LongCharMap createLongCharTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public DoubleByteMap createDoubleByteTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public DoubleBooleanMap createDoubleBooleanTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public DoubleShortMap createDoubleShortTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public DoubleIntMap createDoubleIntTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public DoubleLongMap createDoubleLongTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public DoubleDoubleMap createDoubleDoubleTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public DoubleFloatMap createDoubleFloatTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public DoubleCharMap createDoubleCharTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public FloatByteMap createFloatByteTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public FloatBooleanMap createFloatBooleanTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public FloatShortMap createFloatShortTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public FloatIntMap createFloatIntTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public FloatLongMap createFloatLongTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public FloatDoubleMap createFloatDoubleTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public FloatFloatMap createFloatFloatTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public FloatCharMap createFloatCharTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public CharByteMap createCharByteTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public CharBooleanMap createCharBooleanTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public CharShortMap createCharShortTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public CharIntMap createCharIntTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public CharLongMap createCharLongTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public CharDoubleMap createCharDoubleTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public CharFloatMap createCharFloatTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }

    public CharCharMap createCharCharTreeMap() {
        throw new UnsupportedOperationException("Trove does not support tree map");
    }
}