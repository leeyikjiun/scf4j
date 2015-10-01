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
    public static ByteByteMap createByteByteHashMap() {
        return createByteByteHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteByteMap createByteByteHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteByteHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteByteMap createByteByteHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteByteHashMap();
    }

    public static ByteBooleanMap createByteBooleanHashMap() {
        return createByteBooleanHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteBooleanMap createByteBooleanHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteBooleanHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteBooleanMap createByteBooleanHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteBooleanHashMap();
    }

    public static ByteShortMap createByteShortHashMap() {
        return createByteShortHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteShortMap createByteShortHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteShortHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteShortMap createByteShortHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteShortHashMap();
    }

    public static ByteIntMap createByteIntHashMap() {
        return createByteIntHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteIntMap createByteIntHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteIntHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteIntMap createByteIntHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteIntHashMap();
    }

    public static ByteLongMap createByteLongHashMap() {
        return createByteLongHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteLongMap createByteLongHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteLongHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteLongMap createByteLongHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteLongHashMap();
    }

    public static ByteDoubleMap createByteDoubleHashMap() {
        return createByteDoubleHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteDoubleMap createByteDoubleHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteDoubleHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteDoubleMap createByteDoubleHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteDoubleHashMap();
    }

    public static ByteFloatMap createByteFloatHashMap() {
        return createByteFloatHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteFloatMap createByteFloatHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteFloatHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteFloatMap createByteFloatHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteFloatHashMap();
    }

    public static ByteCharMap createByteCharHashMap() {
        return createByteCharHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteCharMap createByteCharHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteCharHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteCharMap createByteCharHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteCharHashMap();
    }

    public static BooleanByteMap createBooleanByteHashMap() {
        return createBooleanByteHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanByteMap createBooleanByteHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanByteHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanByteMap createBooleanByteHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanByteHashMap();
    }

    public static BooleanBooleanMap createBooleanBooleanHashMap() {
        return createBooleanBooleanHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanBooleanMap createBooleanBooleanHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanBooleanHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanBooleanMap createBooleanBooleanHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanBooleanHashMap();
    }

    public static BooleanShortMap createBooleanShortHashMap() {
        return createBooleanShortHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanShortMap createBooleanShortHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanShortHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanShortMap createBooleanShortHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanShortHashMap();
    }

    public static BooleanIntMap createBooleanIntHashMap() {
        return createBooleanIntHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanIntMap createBooleanIntHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanIntHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanIntMap createBooleanIntHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanIntHashMap();
    }

    public static BooleanLongMap createBooleanLongHashMap() {
        return createBooleanLongHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanLongMap createBooleanLongHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanLongHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanLongMap createBooleanLongHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanLongHashMap();
    }

    public static BooleanDoubleMap createBooleanDoubleHashMap() {
        return createBooleanDoubleHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanDoubleMap createBooleanDoubleHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanDoubleHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanDoubleMap createBooleanDoubleHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanDoubleHashMap();
    }

    public static BooleanFloatMap createBooleanFloatHashMap() {
        return createBooleanFloatHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanFloatMap createBooleanFloatHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanFloatHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanFloatMap createBooleanFloatHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanFloatHashMap();
    }

    public static BooleanCharMap createBooleanCharHashMap() {
        return createBooleanCharHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanCharMap createBooleanCharHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanCharHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanCharMap createBooleanCharHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanCharHashMap();
    }

    public static ShortByteMap createShortByteHashMap() {
        return createShortByteHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortByteMap createShortByteHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortByteHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortByteMap createShortByteHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortByteHashMap();
    }

    public static ShortBooleanMap createShortBooleanHashMap() {
        return createShortBooleanHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortBooleanMap createShortBooleanHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortBooleanHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortBooleanMap createShortBooleanHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortBooleanHashMap();
    }

    public static ShortShortMap createShortShortHashMap() {
        return createShortShortHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortShortMap createShortShortHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortShortHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortShortMap createShortShortHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortShortHashMap();
    }

    public static ShortIntMap createShortIntHashMap() {
        return createShortIntHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortIntMap createShortIntHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortIntHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortIntMap createShortIntHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortIntHashMap();
    }

    public static ShortLongMap createShortLongHashMap() {
        return createShortLongHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortLongMap createShortLongHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortLongHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortLongMap createShortLongHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortLongHashMap();
    }

    public static ShortDoubleMap createShortDoubleHashMap() {
        return createShortDoubleHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortDoubleMap createShortDoubleHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortDoubleHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortDoubleMap createShortDoubleHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortDoubleHashMap();
    }

    public static ShortFloatMap createShortFloatHashMap() {
        return createShortFloatHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortFloatMap createShortFloatHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortFloatHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortFloatMap createShortFloatHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortFloatHashMap();
    }

    public static ShortCharMap createShortCharHashMap() {
        return createShortCharHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortCharMap createShortCharHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortCharHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortCharMap createShortCharHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortCharHashMap();
    }

    public static IntByteMap createIntByteHashMap() {
        return createIntByteHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntByteMap createIntByteHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntByteHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntByteMap createIntByteHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntByteHashMap();
    }

    public static IntBooleanMap createIntBooleanHashMap() {
        return createIntBooleanHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntBooleanMap createIntBooleanHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntBooleanHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntBooleanMap createIntBooleanHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntBooleanHashMap();
    }

    public static IntShortMap createIntShortHashMap() {
        return createIntShortHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntShortMap createIntShortHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntShortHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntShortMap createIntShortHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntShortHashMap();
    }

    public static IntIntMap createIntIntHashMap() {
        return createIntIntHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntIntMap createIntIntHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntIntHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntIntMap createIntIntHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntIntHashMap();
    }

    public static IntLongMap createIntLongHashMap() {
        return createIntLongHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntLongMap createIntLongHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntLongHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntLongMap createIntLongHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntLongHashMap();
    }

    public static IntDoubleMap createIntDoubleHashMap() {
        return createIntDoubleHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntDoubleMap createIntDoubleHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntDoubleHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntDoubleMap createIntDoubleHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntDoubleHashMap();
    }

    public static IntFloatMap createIntFloatHashMap() {
        return createIntFloatHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntFloatMap createIntFloatHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntFloatHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntFloatMap createIntFloatHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntFloatHashMap();
    }

    public static IntCharMap createIntCharHashMap() {
        return createIntCharHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntCharMap createIntCharHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntCharHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntCharMap createIntCharHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntCharHashMap();
    }

    public static LongByteMap createLongByteHashMap() {
        return createLongByteHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongByteMap createLongByteHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongByteHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongByteMap createLongByteHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongByteHashMap();
    }

    public static LongBooleanMap createLongBooleanHashMap() {
        return createLongBooleanHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongBooleanMap createLongBooleanHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongBooleanHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongBooleanMap createLongBooleanHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongBooleanHashMap();
    }

    public static LongShortMap createLongShortHashMap() {
        return createLongShortHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongShortMap createLongShortHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongShortHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongShortMap createLongShortHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongShortHashMap();
    }

    public static LongIntMap createLongIntHashMap() {
        return createLongIntHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongIntMap createLongIntHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongIntHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongIntMap createLongIntHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongIntHashMap();
    }

    public static LongLongMap createLongLongHashMap() {
        return createLongLongHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongLongMap createLongLongHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongLongHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongLongMap createLongLongHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongLongHashMap();
    }

    public static LongDoubleMap createLongDoubleHashMap() {
        return createLongDoubleHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongDoubleMap createLongDoubleHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongDoubleHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongDoubleMap createLongDoubleHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongDoubleHashMap();
    }

    public static LongFloatMap createLongFloatHashMap() {
        return createLongFloatHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongFloatMap createLongFloatHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongFloatHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongFloatMap createLongFloatHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongFloatHashMap();
    }

    public static LongCharMap createLongCharHashMap() {
        return createLongCharHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongCharMap createLongCharHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongCharHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongCharMap createLongCharHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongCharHashMap();
    }

    public static DoubleByteMap createDoubleByteHashMap() {
        return createDoubleByteHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleByteMap createDoubleByteHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleByteHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleByteMap createDoubleByteHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleByteHashMap();
    }

    public static DoubleBooleanMap createDoubleBooleanHashMap() {
        return createDoubleBooleanHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleBooleanMap createDoubleBooleanHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleBooleanHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleBooleanMap createDoubleBooleanHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleBooleanHashMap();
    }

    public static DoubleShortMap createDoubleShortHashMap() {
        return createDoubleShortHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleShortMap createDoubleShortHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleShortHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleShortMap createDoubleShortHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleShortHashMap();
    }

    public static DoubleIntMap createDoubleIntHashMap() {
        return createDoubleIntHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleIntMap createDoubleIntHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleIntHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleIntMap createDoubleIntHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleIntHashMap();
    }

    public static DoubleLongMap createDoubleLongHashMap() {
        return createDoubleLongHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleLongMap createDoubleLongHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleLongHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleLongMap createDoubleLongHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleLongHashMap();
    }

    public static DoubleDoubleMap createDoubleDoubleHashMap() {
        return createDoubleDoubleHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleDoubleMap createDoubleDoubleHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleDoubleHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleDoubleMap createDoubleDoubleHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleDoubleHashMap();
    }

    public static DoubleFloatMap createDoubleFloatHashMap() {
        return createDoubleFloatHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleFloatMap createDoubleFloatHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleFloatHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleFloatMap createDoubleFloatHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleFloatHashMap();
    }

    public static DoubleCharMap createDoubleCharHashMap() {
        return createDoubleCharHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleCharMap createDoubleCharHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleCharHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleCharMap createDoubleCharHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleCharHashMap();
    }

    public static FloatByteMap createFloatByteHashMap() {
        return createFloatByteHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatByteMap createFloatByteHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatByteHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatByteMap createFloatByteHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatByteHashMap();
    }

    public static FloatBooleanMap createFloatBooleanHashMap() {
        return createFloatBooleanHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatBooleanMap createFloatBooleanHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatBooleanHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatBooleanMap createFloatBooleanHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatBooleanHashMap();
    }

    public static FloatShortMap createFloatShortHashMap() {
        return createFloatShortHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatShortMap createFloatShortHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatShortHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatShortMap createFloatShortHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatShortHashMap();
    }

    public static FloatIntMap createFloatIntHashMap() {
        return createFloatIntHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatIntMap createFloatIntHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatIntHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatIntMap createFloatIntHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatIntHashMap();
    }

    public static FloatLongMap createFloatLongHashMap() {
        return createFloatLongHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatLongMap createFloatLongHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatLongHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatLongMap createFloatLongHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatLongHashMap();
    }

    public static FloatDoubleMap createFloatDoubleHashMap() {
        return createFloatDoubleHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatDoubleMap createFloatDoubleHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatDoubleHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatDoubleMap createFloatDoubleHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatDoubleHashMap();
    }

    public static FloatFloatMap createFloatFloatHashMap() {
        return createFloatFloatHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatFloatMap createFloatFloatHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatFloatHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatFloatMap createFloatFloatHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatFloatHashMap();
    }

    public static FloatCharMap createFloatCharHashMap() {
        return createFloatCharHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatCharMap createFloatCharHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatCharHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatCharMap createFloatCharHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatCharHashMap();
    }

    public static CharByteMap createCharByteHashMap() {
        return createCharByteHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharByteMap createCharByteHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharByteHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharByteMap createCharByteHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharByteHashMap();
    }

    public static CharBooleanMap createCharBooleanHashMap() {
        return createCharBooleanHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharBooleanMap createCharBooleanHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharBooleanHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharBooleanMap createCharBooleanHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharBooleanHashMap();
    }

    public static CharShortMap createCharShortHashMap() {
        return createCharShortHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharShortMap createCharShortHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharShortHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharShortMap createCharShortHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharShortHashMap();
    }

    public static CharIntMap createCharIntHashMap() {
        return createCharIntHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharIntMap createCharIntHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharIntHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharIntMap createCharIntHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharIntHashMap();
    }

    public static CharLongMap createCharLongHashMap() {
        return createCharLongHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharLongMap createCharLongHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharLongHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharLongMap createCharLongHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharLongHashMap();
    }

    public static CharDoubleMap createCharDoubleHashMap() {
        return createCharDoubleHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharDoubleMap createCharDoubleHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharDoubleHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharDoubleMap createCharDoubleHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharDoubleHashMap();
    }

    public static CharFloatMap createCharFloatHashMap() {
        return createCharFloatHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharFloatMap createCharFloatHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharFloatHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharFloatMap createCharFloatHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharFloatHashMap();
    }

    public static CharCharMap createCharCharHashMap() {
        return createCharCharHashMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharCharMap createCharCharHashMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharCharHashMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharCharMap createCharCharHashMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharCharHashMap();
    }

    public static ByteByteMap createByteByteTreeMap() {
        return createByteByteTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteByteMap createByteByteTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteByteTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteByteMap createByteByteTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteByteTreeMap();
    }

    public static ByteBooleanMap createByteBooleanTreeMap() {
        return createByteBooleanTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteBooleanMap createByteBooleanTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteBooleanTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteBooleanMap createByteBooleanTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteBooleanTreeMap();
    }

    public static ByteShortMap createByteShortTreeMap() {
        return createByteShortTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteShortMap createByteShortTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteShortTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteShortMap createByteShortTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteShortTreeMap();
    }

    public static ByteIntMap createByteIntTreeMap() {
        return createByteIntTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteIntMap createByteIntTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteIntTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteIntMap createByteIntTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteIntTreeMap();
    }

    public static ByteLongMap createByteLongTreeMap() {
        return createByteLongTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteLongMap createByteLongTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteLongTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteLongMap createByteLongTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteLongTreeMap();
    }

    public static ByteDoubleMap createByteDoubleTreeMap() {
        return createByteDoubleTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteDoubleMap createByteDoubleTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteDoubleTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteDoubleMap createByteDoubleTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteDoubleTreeMap();
    }

    public static ByteFloatMap createByteFloatTreeMap() {
        return createByteFloatTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteFloatMap createByteFloatTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteFloatTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteFloatMap createByteFloatTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteFloatTreeMap();
    }

    public static ByteCharMap createByteCharTreeMap() {
        return createByteCharTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ByteCharMap createByteCharTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createByteCharTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ByteCharMap createByteCharTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createByteCharTreeMap();
    }

    public static BooleanByteMap createBooleanByteTreeMap() {
        return createBooleanByteTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanByteMap createBooleanByteTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanByteTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanByteMap createBooleanByteTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanByteTreeMap();
    }

    public static BooleanBooleanMap createBooleanBooleanTreeMap() {
        return createBooleanBooleanTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanBooleanMap createBooleanBooleanTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanBooleanTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanBooleanMap createBooleanBooleanTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanBooleanTreeMap();
    }

    public static BooleanShortMap createBooleanShortTreeMap() {
        return createBooleanShortTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanShortMap createBooleanShortTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanShortTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanShortMap createBooleanShortTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanShortTreeMap();
    }

    public static BooleanIntMap createBooleanIntTreeMap() {
        return createBooleanIntTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanIntMap createBooleanIntTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanIntTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanIntMap createBooleanIntTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanIntTreeMap();
    }

    public static BooleanLongMap createBooleanLongTreeMap() {
        return createBooleanLongTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanLongMap createBooleanLongTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanLongTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanLongMap createBooleanLongTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanLongTreeMap();
    }

    public static BooleanDoubleMap createBooleanDoubleTreeMap() {
        return createBooleanDoubleTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanDoubleMap createBooleanDoubleTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanDoubleTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanDoubleMap createBooleanDoubleTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanDoubleTreeMap();
    }

    public static BooleanFloatMap createBooleanFloatTreeMap() {
        return createBooleanFloatTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanFloatMap createBooleanFloatTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanFloatTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanFloatMap createBooleanFloatTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanFloatTreeMap();
    }

    public static BooleanCharMap createBooleanCharTreeMap() {
        return createBooleanCharTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static BooleanCharMap createBooleanCharTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createBooleanCharTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static BooleanCharMap createBooleanCharTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createBooleanCharTreeMap();
    }

    public static ShortByteMap createShortByteTreeMap() {
        return createShortByteTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortByteMap createShortByteTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortByteTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortByteMap createShortByteTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortByteTreeMap();
    }

    public static ShortBooleanMap createShortBooleanTreeMap() {
        return createShortBooleanTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortBooleanMap createShortBooleanTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortBooleanTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortBooleanMap createShortBooleanTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortBooleanTreeMap();
    }

    public static ShortShortMap createShortShortTreeMap() {
        return createShortShortTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortShortMap createShortShortTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortShortTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortShortMap createShortShortTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortShortTreeMap();
    }

    public static ShortIntMap createShortIntTreeMap() {
        return createShortIntTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortIntMap createShortIntTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortIntTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortIntMap createShortIntTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortIntTreeMap();
    }

    public static ShortLongMap createShortLongTreeMap() {
        return createShortLongTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortLongMap createShortLongTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortLongTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortLongMap createShortLongTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortLongTreeMap();
    }

    public static ShortDoubleMap createShortDoubleTreeMap() {
        return createShortDoubleTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortDoubleMap createShortDoubleTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortDoubleTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortDoubleMap createShortDoubleTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortDoubleTreeMap();
    }

    public static ShortFloatMap createShortFloatTreeMap() {
        return createShortFloatTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortFloatMap createShortFloatTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortFloatTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortFloatMap createShortFloatTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortFloatTreeMap();
    }

    public static ShortCharMap createShortCharTreeMap() {
        return createShortCharTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static ShortCharMap createShortCharTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createShortCharTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static ShortCharMap createShortCharTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createShortCharTreeMap();
    }

    public static IntByteMap createIntByteTreeMap() {
        return createIntByteTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntByteMap createIntByteTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntByteTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntByteMap createIntByteTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntByteTreeMap();
    }

    public static IntBooleanMap createIntBooleanTreeMap() {
        return createIntBooleanTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntBooleanMap createIntBooleanTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntBooleanTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntBooleanMap createIntBooleanTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntBooleanTreeMap();
    }

    public static IntShortMap createIntShortTreeMap() {
        return createIntShortTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntShortMap createIntShortTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntShortTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntShortMap createIntShortTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntShortTreeMap();
    }

    public static IntIntMap createIntIntTreeMap() {
        return createIntIntTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntIntMap createIntIntTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntIntTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntIntMap createIntIntTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntIntTreeMap();
    }

    public static IntLongMap createIntLongTreeMap() {
        return createIntLongTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntLongMap createIntLongTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntLongTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntLongMap createIntLongTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntLongTreeMap();
    }

    public static IntDoubleMap createIntDoubleTreeMap() {
        return createIntDoubleTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntDoubleMap createIntDoubleTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntDoubleTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntDoubleMap createIntDoubleTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntDoubleTreeMap();
    }

    public static IntFloatMap createIntFloatTreeMap() {
        return createIntFloatTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntFloatMap createIntFloatTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntFloatTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntFloatMap createIntFloatTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntFloatTreeMap();
    }

    public static IntCharMap createIntCharTreeMap() {
        return createIntCharTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static IntCharMap createIntCharTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createIntCharTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static IntCharMap createIntCharTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createIntCharTreeMap();
    }

    public static LongByteMap createLongByteTreeMap() {
        return createLongByteTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongByteMap createLongByteTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongByteTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongByteMap createLongByteTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongByteTreeMap();
    }

    public static LongBooleanMap createLongBooleanTreeMap() {
        return createLongBooleanTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongBooleanMap createLongBooleanTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongBooleanTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongBooleanMap createLongBooleanTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongBooleanTreeMap();
    }

    public static LongShortMap createLongShortTreeMap() {
        return createLongShortTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongShortMap createLongShortTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongShortTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongShortMap createLongShortTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongShortTreeMap();
    }

    public static LongIntMap createLongIntTreeMap() {
        return createLongIntTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongIntMap createLongIntTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongIntTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongIntMap createLongIntTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongIntTreeMap();
    }

    public static LongLongMap createLongLongTreeMap() {
        return createLongLongTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongLongMap createLongLongTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongLongTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongLongMap createLongLongTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongLongTreeMap();
    }

    public static LongDoubleMap createLongDoubleTreeMap() {
        return createLongDoubleTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongDoubleMap createLongDoubleTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongDoubleTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongDoubleMap createLongDoubleTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongDoubleTreeMap();
    }

    public static LongFloatMap createLongFloatTreeMap() {
        return createLongFloatTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongFloatMap createLongFloatTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongFloatTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongFloatMap createLongFloatTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongFloatTreeMap();
    }

    public static LongCharMap createLongCharTreeMap() {
        return createLongCharTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static LongCharMap createLongCharTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createLongCharTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static LongCharMap createLongCharTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createLongCharTreeMap();
    }

    public static DoubleByteMap createDoubleByteTreeMap() {
        return createDoubleByteTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleByteMap createDoubleByteTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleByteTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleByteMap createDoubleByteTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleByteTreeMap();
    }

    public static DoubleBooleanMap createDoubleBooleanTreeMap() {
        return createDoubleBooleanTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleBooleanMap createDoubleBooleanTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleBooleanTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleBooleanMap createDoubleBooleanTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleBooleanTreeMap();
    }

    public static DoubleShortMap createDoubleShortTreeMap() {
        return createDoubleShortTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleShortMap createDoubleShortTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleShortTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleShortMap createDoubleShortTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleShortTreeMap();
    }

    public static DoubleIntMap createDoubleIntTreeMap() {
        return createDoubleIntTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleIntMap createDoubleIntTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleIntTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleIntMap createDoubleIntTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleIntTreeMap();
    }

    public static DoubleLongMap createDoubleLongTreeMap() {
        return createDoubleLongTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleLongMap createDoubleLongTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleLongTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleLongMap createDoubleLongTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleLongTreeMap();
    }

    public static DoubleDoubleMap createDoubleDoubleTreeMap() {
        return createDoubleDoubleTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleDoubleMap createDoubleDoubleTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleDoubleTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleDoubleMap createDoubleDoubleTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleDoubleTreeMap();
    }

    public static DoubleFloatMap createDoubleFloatTreeMap() {
        return createDoubleFloatTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleFloatMap createDoubleFloatTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleFloatTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleFloatMap createDoubleFloatTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleFloatTreeMap();
    }

    public static DoubleCharMap createDoubleCharTreeMap() {
        return createDoubleCharTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static DoubleCharMap createDoubleCharTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createDoubleCharTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static DoubleCharMap createDoubleCharTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createDoubleCharTreeMap();
    }

    public static FloatByteMap createFloatByteTreeMap() {
        return createFloatByteTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatByteMap createFloatByteTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatByteTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatByteMap createFloatByteTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatByteTreeMap();
    }

    public static FloatBooleanMap createFloatBooleanTreeMap() {
        return createFloatBooleanTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatBooleanMap createFloatBooleanTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatBooleanTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatBooleanMap createFloatBooleanTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatBooleanTreeMap();
    }

    public static FloatShortMap createFloatShortTreeMap() {
        return createFloatShortTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatShortMap createFloatShortTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatShortTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatShortMap createFloatShortTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatShortTreeMap();
    }

    public static FloatIntMap createFloatIntTreeMap() {
        return createFloatIntTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatIntMap createFloatIntTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatIntTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatIntMap createFloatIntTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatIntTreeMap();
    }

    public static FloatLongMap createFloatLongTreeMap() {
        return createFloatLongTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatLongMap createFloatLongTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatLongTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatLongMap createFloatLongTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatLongTreeMap();
    }

    public static FloatDoubleMap createFloatDoubleTreeMap() {
        return createFloatDoubleTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatDoubleMap createFloatDoubleTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatDoubleTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatDoubleMap createFloatDoubleTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatDoubleTreeMap();
    }

    public static FloatFloatMap createFloatFloatTreeMap() {
        return createFloatFloatTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatFloatMap createFloatFloatTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatFloatTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatFloatMap createFloatFloatTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatFloatTreeMap();
    }

    public static FloatCharMap createFloatCharTreeMap() {
        return createFloatCharTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static FloatCharMap createFloatCharTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createFloatCharTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static FloatCharMap createFloatCharTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createFloatCharTreeMap();
    }

    public static CharByteMap createCharByteTreeMap() {
        return createCharByteTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharByteMap createCharByteTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharByteTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharByteMap createCharByteTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharByteTreeMap();
    }

    public static CharBooleanMap createCharBooleanTreeMap() {
        return createCharBooleanTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharBooleanMap createCharBooleanTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharBooleanTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharBooleanMap createCharBooleanTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharBooleanTreeMap();
    }

    public static CharShortMap createCharShortTreeMap() {
        return createCharShortTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharShortMap createCharShortTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharShortTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharShortMap createCharShortTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharShortTreeMap();
    }

    public static CharIntMap createCharIntTreeMap() {
        return createCharIntTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharIntMap createCharIntTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharIntTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharIntMap createCharIntTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharIntTreeMap();
    }

    public static CharLongMap createCharLongTreeMap() {
        return createCharLongTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharLongMap createCharLongTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharLongTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharLongMap createCharLongTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharLongTreeMap();
    }

    public static CharDoubleMap createCharDoubleTreeMap() {
        return createCharDoubleTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharDoubleMap createCharDoubleTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharDoubleTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharDoubleMap createCharDoubleTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharDoubleTreeMap();
    }

    public static CharFloatMap createCharFloatTreeMap() {
        return createCharFloatTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharFloatMap createCharFloatTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharFloatTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharFloatMap createCharFloatTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharFloatTreeMap();
    }

    public static CharCharMap createCharCharTreeMap() {
        return createCharCharTreeMap(MapFactoryProvider.getInstance().getMapFactory());
    }

    public static CharCharMap createCharCharTreeMap(Class<MapFactoryDelegate> clazz) {
        try {
            return createCharCharTreeMap(clazz.newInstance());
        } catch (InstantiationException e) {
            throw new IllegalStateException(e);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException(e);
        }
    }

    private static CharCharMap createCharCharTreeMap(MapFactoryDelegate factoryDelegate) {
        return factoryDelegate.createCharCharTreeMap();
    }
}