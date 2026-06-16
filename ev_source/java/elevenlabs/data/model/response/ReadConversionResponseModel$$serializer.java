package io.elevenlabs.data.model.response;

import io.elevenlabs.data.model.BigDecimalJson;
import io.elevenlabs.data.model.response.ReadConversionResponseModel;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import sn.h;
import ur.a0;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/response/ReadConversionResponseModel.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/response/ReadConversionResponseModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/response/ReadConversionResponseModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/response/ReadConversionResponseModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@sn.c
/* loaded from: classes3.dex */
public final /* synthetic */ class ReadConversionResponseModel$$serializer implements a0 {
    public static final ReadConversionResponseModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReadConversionResponseModel$$serializer readConversionResponseModel$$serializer = new ReadConversionResponseModel$$serializer();
        INSTANCE = readConversionResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.response.ReadConversionResponseModel", readConversionResponseModel$$serializer, 6);
        pluginGeneratedSerialDescriptor.b("read_id", false);
        pluginGeneratedSerialDescriptor.b("voice_id", false);
        pluginGeneratedSerialDescriptor.b("status", false);
        pluginGeneratedSerialDescriptor.b("progress", false);
        pluginGeneratedSerialDescriptor.b("message", false);
        pluginGeneratedSerialDescriptor.b("chapter_index", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReadConversionResponseModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = ReadConversionResponseModel.$childSerializers;
        g1 g1Var = g1.f34588a;
        return new KSerializer[]{g1Var, g1Var, hVarArr[2].getValue(), hVarArr[3].getValue(), c1.w(g1Var), c1.w(l0.f34611a)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ReadConversionResponseModel deserialize(Decoder decoder) {
        h[] hVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        hVarArr = ReadConversionResponseModel.$childSerializers;
        b10.getClass();
        int i10 = 0;
        String str = null;
        String str2 = null;
        ReadConversionResponseModel.Status status = null;
        BigDecimalJson bigDecimalJson = null;
        String str3 = null;
        Long l4 = null;
        boolean z6 = true;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    str = b10.q(serialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = b10.q(serialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    status = (ReadConversionResponseModel.Status) b10.d0(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), status);
                    i10 |= 4;
                    break;
                case 3:
                    bigDecimalJson = (BigDecimalJson) b10.d0(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), bigDecimalJson);
                    i10 |= 8;
                    break;
                case 4:
                    str3 = (String) b10.b0(serialDescriptor, 4, g1.f34588a, str3);
                    i10 |= 16;
                    break;
                case 5:
                    l4 = (Long) b10.b0(serialDescriptor, 5, l0.f34611a, l4);
                    i10 |= 32;
                    break;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(serialDescriptor);
        return new ReadConversionResponseModel(i10, str, str2, status, bigDecimalJson, str3, l4, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ReadConversionResponseModel value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.b b10 = encoder.b(serialDescriptor);
        ReadConversionResponseModel.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
