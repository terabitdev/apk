package io.elevenlabs.data.model;

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
import tr.b;
import ur.a0;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/OneTimeProduct.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/OneTimeProduct;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/OneTimeProduct;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/OneTimeProduct;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes3.dex */
public final /* synthetic */ class OneTimeProduct$$serializer implements a0 {
    public static final OneTimeProduct$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        OneTimeProduct$$serializer oneTimeProduct$$serializer = new OneTimeProduct$$serializer();
        INSTANCE = oneTimeProduct$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.OneTimeProduct", oneTimeProduct$$serializer, 9);
        pluginGeneratedSerialDescriptor.b("id", false);
        pluginGeneratedSerialDescriptor.b("title", false);
        pluginGeneratedSerialDescriptor.b("credits", false);
        pluginGeneratedSerialDescriptor.b("hours", false);
        pluginGeneratedSerialDescriptor.b("hours_before_discount", false);
        pluginGeneratedSerialDescriptor.b("description", false);
        pluginGeneratedSerialDescriptor.b("credits_tier", false);
        pluginGeneratedSerialDescriptor.b("type", true);
        pluginGeneratedSerialDescriptor.b("badge_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private OneTimeProduct$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = OneTimeProduct.$childSerializers;
        g1 g1Var = g1.f34588a;
        l0 l0Var = l0.f34611a;
        return new KSerializer[]{hVarArr[0].getValue(), g1Var, l0Var, l0Var, c1.w(l0Var), g1Var, hVarArr[6].getValue(), c1.w((KSerializer) hVarArr[7].getValue()), c1.w(g1Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final OneTimeProduct deserialize(Decoder decoder) {
        h[] hVarArr;
        h[] hVarArr2;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        hVarArr = OneTimeProduct.$childSerializers;
        b10.getClass();
        Long l4 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j4 = 0;
        long j10 = 0;
        int i10 = 0;
        boolean z6 = true;
        String str5 = null;
        String str6 = null;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    hVarArr2 = hVarArr;
                    z6 = false;
                    break;
                case 0:
                    hVarArr2 = hVarArr;
                    str2 = (String) b10.d0(serialDescriptor, 0, (KSerializer) hVarArr2[0].getValue(), str2);
                    i10 |= 1;
                    break;
                case 1:
                    hVarArr2 = hVarArr;
                    str3 = b10.q(serialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    hVarArr2 = hVarArr;
                    j4 = b10.i(serialDescriptor, 2);
                    i10 |= 4;
                    break;
                case 3:
                    hVarArr2 = hVarArr;
                    j10 = b10.i(serialDescriptor, 3);
                    i10 |= 8;
                    break;
                case 4:
                    hVarArr2 = hVarArr;
                    l4 = (Long) b10.b0(serialDescriptor, 4, l0.f34611a, l4);
                    i10 |= 16;
                    break;
                case 5:
                    hVarArr2 = hVarArr;
                    str4 = b10.q(serialDescriptor, 5);
                    i10 |= 32;
                    break;
                case 6:
                    hVarArr2 = hVarArr;
                    str5 = (String) b10.d0(serialDescriptor, 6, (KSerializer) hVarArr2[6].getValue(), str5);
                    i10 |= 64;
                    break;
                case 7:
                    hVarArr2 = hVarArr;
                    str6 = (String) b10.b0(serialDescriptor, 7, (KSerializer) hVarArr2[7].getValue(), str6);
                    i10 |= 128;
                    break;
                case 8:
                    hVarArr2 = hVarArr;
                    str = (String) b10.b0(serialDescriptor, 8, g1.f34588a, str);
                    i10 |= RpcError.MAX_MESSAGE_BYTES;
                    break;
                default:
                    ha.a.e(s10);
                    return null;
            }
            hVarArr = hVarArr2;
        }
        b10.c(serialDescriptor);
        return new OneTimeProduct(i10, str2, str3, j4, j10, l4, str4, str5, str6, str, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, OneTimeProduct value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b b10 = encoder.b(serialDescriptor);
        OneTimeProduct.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
