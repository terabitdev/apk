package io.livekit.android.token;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import sn.c;
import tr.a;
import tr.b;
import ur.a0;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"io/livekit/android/token/RoomAgentDispatch.$serializer", "Lur/a0;", "Lio/livekit/android/token/RoomAgentDispatch;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/livekit/android/token/RoomAgentDispatch;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/livekit/android/token/RoomAgentDispatch;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes4.dex */
public final class RoomAgentDispatch$$serializer implements a0 {
    public static final RoomAgentDispatch$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RoomAgentDispatch$$serializer roomAgentDispatch$$serializer = new RoomAgentDispatch$$serializer();
        INSTANCE = roomAgentDispatch$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.livekit.android.token.RoomAgentDispatch", roomAgentDispatch$$serializer, 2);
        pluginGeneratedSerialDescriptor.b("agentName", true);
        pluginGeneratedSerialDescriptor.b("metadata", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RoomAgentDispatch$$serializer() {
    }

    @Override // ur.a0
    public KSerializer[] childSerializers() {
        g1 g1Var = g1.f34588a;
        return new KSerializer[]{c1.w(g1Var), c1.w(g1Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public RoomAgentDispatch deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        a b10 = decoder.b(descriptor2);
        b10.getClass();
        boolean z6 = true;
        int i10 = 0;
        String str = null;
        String str2 = null;
        while (z6) {
            int s10 = b10.s(descriptor2);
            if (s10 != -1) {
                if (s10 != 0) {
                    if (s10 == 1) {
                        str2 = (String) b10.b0(descriptor2, 1, g1.f34588a, str2);
                        i10 |= 2;
                    } else {
                        ha.a.e(s10);
                        return null;
                    }
                } else {
                    str = (String) b10.b0(descriptor2, 0, g1.f34588a, str);
                    i10 |= 1;
                }
            } else {
                z6 = false;
            }
        }
        b10.c(descriptor2);
        return new RoomAgentDispatch(i10, str, str2, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, RoomAgentDispatch value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        b b10 = encoder.b(descriptor2);
        RoomAgentDispatch.write$Self$livekit_android_sdk_release(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // ur.a0
    public KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
