package io.elevenlabs.data.model;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import sn.c;
import tr.b;
import ur.a0;
import ur.g;
import ur.g1;
import ur.l0;
import ur.r;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/ReadUpdateModel.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/ReadUpdateModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/ReadUpdateModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/ReadUpdateModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes3.dex */
public final /* synthetic */ class ReadUpdateModel$$serializer implements a0 {
    public static final ReadUpdateModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReadUpdateModel$$serializer readUpdateModel$$serializer = new ReadUpdateModel$$serializer();
        INSTANCE = readUpdateModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.ReadUpdateModel", readUpdateModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.b("last_listened_char_offset", false);
        pluginGeneratedSerialDescriptor.b("title", true);
        pluginGeneratedSerialDescriptor.b("author", true);
        pluginGeneratedSerialDescriptor.b("description", true);
        pluginGeneratedSerialDescriptor.b("marked_as_unread", true);
        pluginGeneratedSerialDescriptor.b("completed_at_unix", true);
        pluginGeneratedSerialDescriptor.b("audio_file_number", true);
        pluginGeneratedSerialDescriptor.b("position_seconds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReadUpdateModel$$serializer() {
    }

    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        l0 l0Var = l0.f34611a;
        g1 g1Var = g1.f34588a;
        return new KSerializer[]{l0Var, c1.w(g1Var), c1.w(g1Var), c1.w(g1Var), c1.w(g.f34583a), c1.w(l0Var), c1.w(g1Var), c1.w(r.f34640a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ReadUpdateModel deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        b10.getClass();
        String str = null;
        long j4 = 0;
        Double d10 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        Boolean bool = null;
        Long l4 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    j4 = b10.i(serialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = (String) b10.b0(serialDescriptor, 1, g1.f34588a, str2);
                    i10 |= 2;
                    break;
                case 2:
                    str3 = (String) b10.b0(serialDescriptor, 2, g1.f34588a, str3);
                    i10 |= 4;
                    break;
                case 3:
                    str4 = (String) b10.b0(serialDescriptor, 3, g1.f34588a, str4);
                    i10 |= 8;
                    break;
                case 4:
                    bool = (Boolean) b10.b0(serialDescriptor, 4, g.f34583a, bool);
                    i10 |= 16;
                    break;
                case 5:
                    l4 = (Long) b10.b0(serialDescriptor, 5, l0.f34611a, l4);
                    i10 |= 32;
                    break;
                case 6:
                    str = (String) b10.b0(serialDescriptor, 6, g1.f34588a, str);
                    i10 |= 64;
                    break;
                case 7:
                    d10 = (Double) b10.b0(serialDescriptor, 7, r.f34640a, d10);
                    i10 |= 128;
                    break;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(serialDescriptor);
        return new ReadUpdateModel(i10, j4, str2, str3, str4, bool, l4, str, d10, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ReadUpdateModel value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b b10 = encoder.b(serialDescriptor);
        ReadUpdateModel.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
