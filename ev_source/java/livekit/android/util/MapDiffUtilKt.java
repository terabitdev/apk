package io.livekit.android.util;

import android.gov.nist.javax.sip.parser.TokenNames;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import kd.a;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0004\u001aS\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0007\u001a\u0002H\u0003¢\u0006\u0002\u0010\b¨\u0006\t"}, d2 = {"diffMapChange", "", TokenNames.K, TokenNames.V, "newMap", "", "oldMap", "defaultValue", "(Ljava/util/Map;Ljava/util/Map;Ljava/lang/Object;)Ljava/util/Map;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class MapDiffUtilKt {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> diffMapChange(Map<K, ? extends V> map, Map<K, ? extends V> map2, V v9) {
        map.getClass();
        map2.getClass();
        LinkedHashSet N = a.N(map.keySet(), map2.keySet());
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Object obj : N) {
            if (!m.c(map.get(obj), map2.get(obj))) {
                V v10 = map.get(obj);
                if (v10 == null) {
                    v10 = v9;
                }
                linkedHashMap.put(obj, v10);
            }
        }
        return linkedHashMap;
    }
}
