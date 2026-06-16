package io.livekit.android.token;

import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.rpc.RpcError;
import java.util.List;
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
import ur.f0;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00060\u0005HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"io/livekit/android/token/RoomConfiguration.$serializer", "Lur/a0;", "Lio/livekit/android/token/RoomConfiguration;", "<init>", "()V", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/livekit/android/token/RoomConfiguration;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/livekit/android/token/RoomConfiguration;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes4.dex */
public final class RoomConfiguration$$serializer implements a0 {
    public static final RoomConfiguration$$serializer INSTANCE;
    private static final /* synthetic */ PluginGeneratedSerialDescriptor descriptor;

    static {
        RoomConfiguration$$serializer roomConfiguration$$serializer = new RoomConfiguration$$serializer();
        INSTANCE = roomConfiguration$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.livekit.android.token.RoomConfiguration", roomConfiguration$$serializer, 9);
        pluginGeneratedSerialDescriptor.b(DiagnosticsEntry.NAME_KEY, true);
        pluginGeneratedSerialDescriptor.b("emptyTimeout", true);
        pluginGeneratedSerialDescriptor.b("departureTimeout", true);
        pluginGeneratedSerialDescriptor.b("maxParticipants", true);
        pluginGeneratedSerialDescriptor.b("metadata", true);
        pluginGeneratedSerialDescriptor.b("minPlayoutDelay", true);
        pluginGeneratedSerialDescriptor.b("maxPlayoutDelay", true);
        pluginGeneratedSerialDescriptor.b("syncStreams", true);
        pluginGeneratedSerialDescriptor.b("agents", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private RoomConfiguration$$serializer() {
    }

    @Override // ur.a0
    public KSerializer[] childSerializers() {
        KSerializer[] kSerializerArr;
        kSerializerArr = RoomConfiguration.$childSerializers;
        g1 g1Var = g1.f34588a;
        KSerializer w6 = c1.w(g1Var);
        f0 f0Var = f0.f34579a;
        return new KSerializer[]{w6, c1.w(f0Var), c1.w(f0Var), c1.w(f0Var), c1.w(g1Var), c1.w(f0Var), c1.w(f0Var), c1.w(f0Var), c1.w(kSerializerArr[8])};
    }

    @Override // kotlinx.serialization.KSerializer
    public RoomConfiguration deserialize(Decoder decoder) {
        KSerializer[] kSerializerArr;
        decoder.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        a b10 = decoder.b(descriptor2);
        kSerializerArr = RoomConfiguration.$childSerializers;
        b10.getClass();
        List list = null;
        String str = null;
        Integer num = null;
        Integer num2 = null;
        Integer num3 = null;
        String str2 = null;
        Integer num4 = null;
        Integer num5 = null;
        Integer num6 = null;
        boolean z6 = true;
        int i10 = 0;
        while (z6) {
            int s10 = b10.s(descriptor2);
            switch (s10) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    str = (String) b10.b0(descriptor2, 0, g1.f34588a, str);
                    i10 |= 1;
                    break;
                case 1:
                    num = (Integer) b10.b0(descriptor2, 1, f0.f34579a, num);
                    i10 |= 2;
                    break;
                case 2:
                    num2 = (Integer) b10.b0(descriptor2, 2, f0.f34579a, num2);
                    i10 |= 4;
                    break;
                case 3:
                    num3 = (Integer) b10.b0(descriptor2, 3, f0.f34579a, num3);
                    i10 |= 8;
                    break;
                case 4:
                    str2 = (String) b10.b0(descriptor2, 4, g1.f34588a, str2);
                    i10 |= 16;
                    break;
                case 5:
                    num4 = (Integer) b10.b0(descriptor2, 5, f0.f34579a, num4);
                    i10 |= 32;
                    break;
                case 6:
                    num5 = (Integer) b10.b0(descriptor2, 6, f0.f34579a, num5);
                    i10 |= 64;
                    break;
                case 7:
                    num6 = (Integer) b10.b0(descriptor2, 7, f0.f34579a, num6);
                    i10 |= 128;
                    break;
                case 8:
                    list = (List) b10.b0(descriptor2, 8, kSerializerArr[8], list);
                    i10 |= RpcError.MAX_MESSAGE_BYTES;
                    break;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(descriptor2);
        return new RoomConfiguration(i10, str, num, num2, num3, str2, num4, num5, num6, list, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, RoomConfiguration value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor2 = getDescriptor();
        b b10 = encoder.b(descriptor2);
        RoomConfiguration.write$Self$livekit_android_sdk_release(value, b10, descriptor2);
        b10.c(descriptor2);
    }

    @Override // ur.a0
    public KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
