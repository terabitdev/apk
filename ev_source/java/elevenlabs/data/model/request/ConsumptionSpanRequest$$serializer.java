package io.elevenlabs.data.model.request;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.data.model.request.ConsumptionSpanRequest;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import sn.c;
import sn.h;
import tr.a;
import tr.b;
import ur.a0;
import ur.g;
import ur.g1;
import ur.l0;
import ur.r;
import ur.t0;
import ur.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/request/ConsumptionSpanRequest.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/request/ConsumptionSpanRequest;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/request/ConsumptionSpanRequest;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/request/ConsumptionSpanRequest;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes3.dex */
public final /* synthetic */ class ConsumptionSpanRequest$$serializer implements a0 {
    public static final ConsumptionSpanRequest$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ConsumptionSpanRequest$$serializer consumptionSpanRequest$$serializer = new ConsumptionSpanRequest$$serializer();
        INSTANCE = consumptionSpanRequest$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.request.ConsumptionSpanRequest", consumptionSpanRequest$$serializer, 13);
        pluginGeneratedSerialDescriptor.b("span_id", false);
        pluginGeneratedSerialDescriptor.b("audio_file_number", false);
        pluginGeneratedSerialDescriptor.b("start_seconds", false);
        pluginGeneratedSerialDescriptor.b("end_seconds", false);
        pluginGeneratedSerialDescriptor.b("start_char_offset", true);
        pluginGeneratedSerialDescriptor.b("end_char_offset", true);
        pluginGeneratedSerialDescriptor.b("listened_at_unix", true);
        pluginGeneratedSerialDescriptor.b("playback_speed", true);
        pluginGeneratedSerialDescriptor.b("real_time_duration_seconds", true);
        pluginGeneratedSerialDescriptor.b("type", false);
        pluginGeneratedSerialDescriptor.b("playback_source", true);
        pluginGeneratedSerialDescriptor.b("device_online", true);
        pluginGeneratedSerialDescriptor.b("voice_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ConsumptionSpanRequest$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = ConsumptionSpanRequest.$childSerializers;
        g1 g1Var = g1.f34588a;
        r rVar = r.f34640a;
        l0 l0Var = l0.f34611a;
        return new KSerializer[]{g1Var, g1Var, rVar, rVar, c1.w(l0Var), c1.w(l0Var), c1.w(l0Var), c1.w(z.f34681a), c1.w(rVar), hVarArr[9].getValue(), c1.w((KSerializer) hVarArr[10].getValue()), c1.w(g.f34583a), c1.w(g1Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ConsumptionSpanRequest deserialize(Decoder decoder) {
        h[] hVarArr;
        h[] hVarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        a b10 = decoder.b(serialDescriptor);
        hVarArr = ConsumptionSpanRequest.$childSerializers;
        b10.getClass();
        Long l4 = null;
        Float f10 = null;
        Double d10 = null;
        String str = null;
        String str2 = null;
        ConsumptionSpanRequest.Type type = null;
        ConsumptionSpanRequest.PlaybackSource playbackSource = null;
        Boolean bool = null;
        String str3 = null;
        double d11 = 0.0d;
        double d12 = 0.0d;
        int i10 = 0;
        boolean z6 = true;
        Long l7 = null;
        Long l10 = null;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    hVarArr2 = hVarArr;
                    z6 = false;
                    break;
                case 0:
                    hVarArr2 = hVarArr;
                    str = b10.q(serialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    hVarArr2 = hVarArr;
                    str2 = b10.q(serialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    hVarArr2 = hVarArr;
                    d11 = b10.c0(serialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    hVarArr2 = hVarArr;
                    d12 = b10.c0(serialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    hVarArr2 = hVarArr;
                    l4 = (Long) b10.b0(serialDescriptor, 4, l0.f34611a, l4);
                    i10 |= 16;
                    break;
                case 5:
                    hVarArr2 = hVarArr;
                    l7 = (Long) b10.b0(serialDescriptor, 5, l0.f34611a, l7);
                    i10 |= 32;
                    break;
                case 6:
                    hVarArr2 = hVarArr;
                    l10 = (Long) b10.b0(serialDescriptor, 6, l0.f34611a, l10);
                    i10 |= 64;
                    break;
                case 7:
                    hVarArr2 = hVarArr;
                    f10 = (Float) b10.b0(serialDescriptor, 7, z.f34681a, f10);
                    i10 |= 128;
                    break;
                case 8:
                    hVarArr2 = hVarArr;
                    d10 = (Double) b10.b0(serialDescriptor, 8, r.f34640a, d10);
                    i10 |= RpcError.MAX_MESSAGE_BYTES;
                    break;
                case 9:
                    hVarArr2 = hVarArr;
                    type = (ConsumptionSpanRequest.Type) b10.d0(serialDescriptor, 9, (KSerializer) hVarArr2[9].getValue(), type);
                    i10 |= 512;
                    break;
                case 10:
                    hVarArr2 = hVarArr;
                    playbackSource = (ConsumptionSpanRequest.PlaybackSource) b10.b0(serialDescriptor, 10, (KSerializer) hVarArr2[10].getValue(), playbackSource);
                    i10 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    break;
                case 11:
                    hVarArr2 = hVarArr;
                    bool = (Boolean) b10.b0(serialDescriptor, 11, g.f34583a, bool);
                    i10 |= 2048;
                    break;
                case 12:
                    hVarArr2 = hVarArr;
                    str3 = (String) b10.b0(serialDescriptor, 12, g1.f34588a, str3);
                    i10 |= 4096;
                    break;
                default:
                    ha.a.e(s10);
                    return null;
            }
            hVarArr = hVarArr2;
        }
        b10.c(serialDescriptor);
        return new ConsumptionSpanRequest(i10, str, str2, d11, d12, l4, l7, l10, f10, d10, type, playbackSource, bool, str3, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ConsumptionSpanRequest value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b b10 = encoder.b(serialDescriptor);
        ConsumptionSpanRequest.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
