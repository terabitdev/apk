package io.elevenlabs.data.serializer;

import a2.p;
import androidx.lifecycle.k1;
import androidx.room.m0;
import io.elevenlabs.data.model.response.AuthorHeaderSection;
import io.elevenlabs.data.model.response.AuthorProfileSection;
import io.elevenlabs.data.model.response.ReadSection;
import io.elevenlabs.data.model.response.SeriesSection;
import kotlin.Metadata;
import kotlin.jvm.internal.e0;
import kotlin.jvm.internal.f0;
import livekit.LivekitInternal$NodeStats;
import p.r;
import sn.z;
import vr.c;
import vr.f;
import xr.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0017\u0010\u0001\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lxr/e;", "sectionSerializersModule", "Lxr/e;", "getSectionSerializersModule", "()Lxr/e;", "Lvr/c;", "json", "Lvr/c;", "getJson", "()Lvr/c;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class JsonKt {
    private static final c json;
    private static final e sectionSerializersModule;

    static {
        k1 k1Var = new k1(17);
        f0 f0Var = e0.f20562a;
        r rVar = new r(f0Var.b(AuthorProfileSection.class));
        rVar.O0(f0Var.b(AuthorHeaderSection.class), AuthorHeaderSection.INSTANCE.serializer());
        rVar.O0(f0Var.b(SeriesSection.class), SeriesSection.INSTANCE.serializer());
        rVar.O0(f0Var.b(ReadSection.class), ReadSection.INSTANCE.serializer());
        rVar.z0(k1Var);
        sectionSerializersModule = k1Var.w();
        json = m0.b(new p(21));
    }

    public static /* synthetic */ z a(f fVar) {
        return json$lambda$0(fVar);
    }

    public static final c getJson() {
        return json;
    }

    public static final e getSectionSerializersModule() {
        return sectionSerializersModule;
    }

    public static final z json$lambda$0(f fVar) {
        fVar.getClass();
        e eVar = sectionSerializersModule;
        eVar.getClass();
        fVar.f35868e = eVar;
        fVar.f35866c = "type";
        fVar.f35865b = true;
        return z.f31622a;
    }
}
