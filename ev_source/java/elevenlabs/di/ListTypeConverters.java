package io.elevenlabs.di;

import io.elevenlabs.data.serializer.JsonKt;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import ur.d;
import ur.g1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0007H\u0007J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\t\u001a\u00020\u0005H\u0007¨\u0006\n"}, d2 = {"Lio/elevenlabs/di/ListTypeConverters;", "", "<init>", "()V", "fromListStringToString", "", "intList", "", "toListStringFromString", "stringList", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ListTypeConverters {
    public final String fromListStringToString(List<String> intList) {
        intList.getClass();
        vr.c json = JsonKt.getJson();
        json.getClass();
        return json.d(new d(g1.f34588a, 0), intList);
    }

    public final List<String> toListStringFromString(String stringList) {
        stringList.getClass();
        vr.c json = JsonKt.getJson();
        json.getClass();
        return (List) json.b(stringList, new d(g1.f34588a, 0));
    }
}
