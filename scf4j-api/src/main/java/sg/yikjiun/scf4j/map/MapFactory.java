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

import sg.yikjiun.scf4j.map.impl.MapFactoryProvider;

/**
 * @author Lee Yik Jiun
 */
public class MapFactory {
    ByteByteMap createByteByteHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteByteHashMap();
    }

    ByteBooleanMap createByteBooleanHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteBooleanHashMap();
    }

    ByteShortMap createByteShortHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteShortHashMap();
    }

    ByteIntMap createByteIntHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteIntHashMap();
    }

    ByteLongMap createByteLongHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteLongHashMap();
    }

    ByteDoubleMap createByteDoubleHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteDoubleHashMap();
    }

    ByteFloatMap createByteFloatHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteFloatHashMap();
    }

    ByteCharMap createByteCharHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteCharHashMap();
    }

    BooleanByteMap createBooleanByteHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanByteHashMap();
    }

    BooleanBooleanMap createBooleanBooleanHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanBooleanHashMap();
    }

    BooleanShortMap createBooleanShortHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanShortHashMap();
    }

    BooleanIntMap createBooleanIntHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanIntHashMap();
    }

    BooleanLongMap createBooleanLongHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanLongHashMap();
    }

    BooleanDoubleMap createBooleanDoubleHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanDoubleHashMap();
    }

    BooleanFloatMap createBooleanFloatHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanFloatHashMap();
    }

    BooleanCharMap createBooleanCharHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanCharHashMap();
    }

    ShortByteMap createShortByteHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortByteHashMap();
    }

    ShortBooleanMap createShortBooleanHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortBooleanHashMap();
    }

    ShortShortMap createShortShortHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortShortHashMap();
    }

    ShortIntMap createShortIntHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortIntHashMap();
    }

    ShortLongMap createShortLongHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortLongHashMap();
    }

    ShortDoubleMap createShortDoubleHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortDoubleHashMap();
    }

    ShortFloatMap createShortFloatHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortFloatHashMap();
    }

    ShortCharMap createShortCharHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortCharHashMap();
    }

    IntByteMap createIntByteHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntByteHashMap();
    }

    IntBooleanMap createIntBooleanHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntBooleanHashMap();
    }

    IntShortMap createIntShortHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntShortHashMap();
    }

    IntIntMap createIntIntHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntIntHashMap();
    }

    IntLongMap createIntLongHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntLongHashMap();
    }

    IntDoubleMap createIntDoubleHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntDoubleHashMap();
    }

    IntFloatMap createIntFloatHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntFloatHashMap();
    }

    IntCharMap createIntCharHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntCharHashMap();
    }

    LongByteMap createLongByteHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongByteHashMap();
    }

    LongBooleanMap createLongBooleanHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongBooleanHashMap();
    }

    LongShortMap createLongShortHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongShortHashMap();
    }

    LongIntMap createLongIntHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongIntHashMap();
    }

    LongLongMap createLongLongHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongLongHashMap();
    }

    LongDoubleMap createLongDoubleHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongDoubleHashMap();
    }

    LongFloatMap createLongFloatHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongFloatHashMap();
    }

    LongCharMap createLongCharHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongCharHashMap();
    }

    DoubleByteMap createDoubleByteHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleByteHashMap();
    }

    DoubleBooleanMap createDoubleBooleanHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleBooleanHashMap();
    }

    DoubleShortMap createDoubleShortHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleShortHashMap();
    }

    DoubleIntMap createDoubleIntHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleIntHashMap();
    }

    DoubleLongMap createDoubleLongHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleLongHashMap();
    }

    DoubleDoubleMap createDoubleDoubleHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleDoubleHashMap();
    }

    DoubleFloatMap createDoubleFloatHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleFloatHashMap();
    }

    DoubleCharMap createDoubleCharHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleCharHashMap();
    }

    FloatByteMap createFloatByteHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatByteHashMap();
    }

    FloatBooleanMap createFloatBooleanHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatBooleanHashMap();
    }

    FloatShortMap createFloatShortHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatShortHashMap();
    }

    FloatIntMap createFloatIntHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatIntHashMap();
    }

    FloatLongMap createFloatLongHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatLongHashMap();
    }

    FloatDoubleMap createFloatDoubleHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatDoubleHashMap();
    }

    FloatFloatMap createFloatFloatHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatFloatHashMap();
    }

    FloatCharMap createFloatCharHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatCharHashMap();
    }

    CharByteMap createCharByteHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharByteHashMap();
    }

    CharBooleanMap createCharBooleanHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharBooleanHashMap();
    }

    CharShortMap createCharShortHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharShortHashMap();
    }

    CharIntMap createCharIntHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharIntHashMap();
    }

    CharLongMap createCharLongHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharLongHashMap();
    }

    CharDoubleMap createCharDoubleHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharDoubleHashMap();
    }

    CharFloatMap createCharFloatHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharFloatHashMap();
    }

    CharCharMap createCharCharHashMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharCharHashMap();
    }

    ByteByteMap createByteByteTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteByteTreeMap();
    }

    ByteBooleanMap createByteBooleanTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteBooleanTreeMap();
    }

    ByteShortMap createByteShortTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteShortTreeMap();
    }

    ByteIntMap createByteIntTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteIntTreeMap();
    }

    ByteLongMap createByteLongTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteLongTreeMap();
    }

    ByteDoubleMap createByteDoubleTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteDoubleTreeMap();
    }

    ByteFloatMap createByteFloatTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteFloatTreeMap();
    }

    ByteCharMap createByteCharTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createByteCharTreeMap();
    }

    BooleanByteMap createBooleanByteTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanByteTreeMap();
    }

    BooleanBooleanMap createBooleanBooleanTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanBooleanTreeMap();
    }

    BooleanShortMap createBooleanShortTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanShortTreeMap();
    }

    BooleanIntMap createBooleanIntTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanIntTreeMap();
    }

    BooleanLongMap createBooleanLongTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanLongTreeMap();
    }

    BooleanDoubleMap createBooleanDoubleTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanDoubleTreeMap();
    }

    BooleanFloatMap createBooleanFloatTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanFloatTreeMap();
    }

    BooleanCharMap createBooleanCharTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createBooleanCharTreeMap();
    }

    ShortByteMap createShortByteTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortByteTreeMap();
    }

    ShortBooleanMap createShortBooleanTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortBooleanTreeMap();
    }

    ShortShortMap createShortShortTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortShortTreeMap();
    }

    ShortIntMap createShortIntTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortIntTreeMap();
    }

    ShortLongMap createShortLongTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortLongTreeMap();
    }

    ShortDoubleMap createShortDoubleTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortDoubleTreeMap();
    }

    ShortFloatMap createShortFloatTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortFloatTreeMap();
    }

    ShortCharMap createShortCharTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createShortCharTreeMap();
    }

    IntByteMap createIntByteTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntByteTreeMap();
    }

    IntBooleanMap createIntBooleanTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntBooleanTreeMap();
    }

    IntShortMap createIntShortTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntShortTreeMap();
    }

    IntIntMap createIntIntTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntIntTreeMap();
    }

    IntLongMap createIntLongTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntLongTreeMap();
    }

    IntDoubleMap createIntDoubleTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntDoubleTreeMap();
    }

    IntFloatMap createIntFloatTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntFloatTreeMap();
    }

    IntCharMap createIntCharTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createIntCharTreeMap();
    }

    LongByteMap createLongByteTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongByteTreeMap();
    }

    LongBooleanMap createLongBooleanTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongBooleanTreeMap();
    }

    LongShortMap createLongShortTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongShortTreeMap();
    }

    LongIntMap createLongIntTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongIntTreeMap();
    }

    LongLongMap createLongLongTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongLongTreeMap();
    }

    LongDoubleMap createLongDoubleTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongDoubleTreeMap();
    }

    LongFloatMap createLongFloatTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongFloatTreeMap();
    }

    LongCharMap createLongCharTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createLongCharTreeMap();
    }

    DoubleByteMap createDoubleByteTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleByteTreeMap();
    }

    DoubleBooleanMap createDoubleBooleanTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleBooleanTreeMap();
    }

    DoubleShortMap createDoubleShortTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleShortTreeMap();
    }

    DoubleIntMap createDoubleIntTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleIntTreeMap();
    }

    DoubleLongMap createDoubleLongTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleLongTreeMap();
    }

    DoubleDoubleMap createDoubleDoubleTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleDoubleTreeMap();
    }

    DoubleFloatMap createDoubleFloatTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleFloatTreeMap();
    }

    DoubleCharMap createDoubleCharTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createDoubleCharTreeMap();
    }

    FloatByteMap createFloatByteTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatByteTreeMap();
    }

    FloatBooleanMap createFloatBooleanTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatBooleanTreeMap();
    }

    FloatShortMap createFloatShortTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatShortTreeMap();
    }

    FloatIntMap createFloatIntTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatIntTreeMap();
    }

    FloatLongMap createFloatLongTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatLongTreeMap();
    }

    FloatDoubleMap createFloatDoubleTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatDoubleTreeMap();
    }

    FloatFloatMap createFloatFloatTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatFloatTreeMap();
    }

    FloatCharMap createFloatCharTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createFloatCharTreeMap();
    }

    CharByteMap createCharByteTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharByteTreeMap();
    }

    CharBooleanMap createCharBooleanTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharBooleanTreeMap();
    }

    CharShortMap createCharShortTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharShortTreeMap();
    }

    CharIntMap createCharIntTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharIntTreeMap();
    }

    CharLongMap createCharLongTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharLongTreeMap();
    }

    CharDoubleMap createCharDoubleTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharDoubleTreeMap();
    }

    CharFloatMap createCharFloatTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharFloatTreeMap();
    }

    CharCharMap createCharCharTreeMap() {
        MapFactoryDelegate factory = MapFactoryProvider.getInstance().getMapFactory();
        return factory.createCharCharTreeMap();
    }
}