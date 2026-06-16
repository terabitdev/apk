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
import sn.h;
import tr.b;
import ur.a0;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/SubscriptionProductV2.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/SubscriptionProductV2;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/SubscriptionProductV2;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/SubscriptionProductV2;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes3.dex */
public final /* synthetic */ class SubscriptionProductV2$$serializer implements a0 {
    public static final SubscriptionProductV2$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SubscriptionProductV2$$serializer subscriptionProductV2$$serializer = new SubscriptionProductV2$$serializer();
        INSTANCE = subscriptionProductV2$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.SubscriptionProductV2", subscriptionProductV2$$serializer, 7);
        pluginGeneratedSerialDescriptor.b("id", false);
        pluginGeneratedSerialDescriptor.b("title", false);
        pluginGeneratedSerialDescriptor.b("description", false);
        pluginGeneratedSerialDescriptor.b("badge_text", false);
        pluginGeneratedSerialDescriptor.b("plan", false);
        pluginGeneratedSerialDescriptor.b("billing_period", false);
        pluginGeneratedSerialDescriptor.b("stripe_price", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private SubscriptionProductV2$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = SubscriptionProductV2.$childSerializers;
        g1 g1Var = g1.f34588a;
        return new KSerializer[]{hVarArr[0].getValue(), g1Var, c1.w(g1Var), c1.w(g1Var), hVarArr[4].getValue(), hVarArr[5].getValue(), c1.w(StripePrice$$serializer.INSTANCE)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final SubscriptionProductV2 deserialize(Decoder decoder) {
        h[] hVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        hVarArr = SubscriptionProductV2.$childSerializers;
        b10.getClass();
        int i10 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        StripePrice stripePrice = null;
        boolean z6 = true;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    str = (String) b10.d0(serialDescriptor, 0, (KSerializer) hVarArr[0].getValue(), str);
                    i10 |= 1;
                    break;
                case 1:
                    str2 = b10.q(serialDescriptor, 1);
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
                    str5 = (String) b10.d0(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), str5);
                    i10 |= 16;
                    break;
                case 5:
                    str6 = (String) b10.d0(serialDescriptor, 5, (KSerializer) hVarArr[5].getValue(), str6);
                    i10 |= 32;
                    break;
                case 6:
                    stripePrice = (StripePrice) b10.b0(serialDescriptor, 6, StripePrice$$serializer.INSTANCE, stripePrice);
                    i10 |= 64;
                    break;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(serialDescriptor);
        return new SubscriptionProductV2(i10, str, str2, str3, str4, str5, str6, stripePrice, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, SubscriptionProductV2 value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b b10 = encoder.b(serialDescriptor);
        SubscriptionProductV2.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
