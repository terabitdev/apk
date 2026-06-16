package io.elevenlabs.data.model.response;

import com.google.firebase.analytics.FirebaseAnalytics;
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
import sn.h;
import ur.a0;
import ur.g;
import ur.g1;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/response/ExploreCollectionDetailsV4Response;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@sn.c
/* loaded from: classes3.dex */
public final /* synthetic */ class ExploreCollectionDetailsV4Response$$serializer implements a0 {
    public static final ExploreCollectionDetailsV4Response$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ExploreCollectionDetailsV4Response$$serializer exploreCollectionDetailsV4Response$$serializer = new ExploreCollectionDetailsV4Response$$serializer();
        INSTANCE = exploreCollectionDetailsV4Response$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.response.ExploreCollectionDetailsV4Response", exploreCollectionDetailsV4Response$$serializer, 10);
        pluginGeneratedSerialDescriptor.b("collection_id", false);
        pluginGeneratedSerialDescriptor.b("title", false);
        pluginGeneratedSerialDescriptor.b("subtitle", true);
        pluginGeneratedSerialDescriptor.b("description", true);
        pluginGeneratedSerialDescriptor.b("category", true);
        pluginGeneratedSerialDescriptor.b("share_url", true);
        pluginGeneratedSerialDescriptor.b("meta", true);
        pluginGeneratedSerialDescriptor.b(FirebaseAnalytics.Param.ITEMS, true);
        pluginGeneratedSerialDescriptor.b("has_more", true);
        pluginGeneratedSerialDescriptor.b("next_cursor", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ExploreCollectionDetailsV4Response$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = ExploreCollectionDetailsV4Response.$childSerializers;
        g1 g1Var = g1.f34588a;
        return new KSerializer[]{g1Var, g1Var, c1.w(g1Var), c1.w(g1Var), c1.w(g1Var), c1.w(g1Var), hVarArr[6].getValue(), hVarArr[7].getValue(), g.f34583a, c1.w(g1Var)};
    }

    @Override // kotlinx.serialization.KSerializer
    public final ExploreCollectionDetailsV4Response deserialize(Decoder decoder) {
        h[] hVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        hVarArr = ExploreCollectionDetailsV4Response.$childSerializers;
        b10.getClass();
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        List list = null;
        List list2 = null;
        boolean z6 = true;
        int i10 = 0;
        boolean z10 = false;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    z6 = false;
                    break;
                case 0:
                    str2 = b10.q(serialDescriptor, 0);
                    i10 |= 1;
                    break;
                case 1:
                    str3 = b10.q(serialDescriptor, 1);
                    i10 |= 2;
                    break;
                case 2:
                    str4 = (String) b10.b0(serialDescriptor, 2, g1.f34588a, str4);
                    i10 |= 4;
                    break;
                case 3:
                    str5 = (String) b10.b0(serialDescriptor, 3, g1.f34588a, str5);
                    i10 |= 8;
                    break;
                case 4:
                    str6 = (String) b10.b0(serialDescriptor, 4, g1.f34588a, str6);
                    i10 |= 16;
                    break;
                case 5:
                    str7 = (String) b10.b0(serialDescriptor, 5, g1.f34588a, str7);
                    i10 |= 32;
                    break;
                case 6:
                    list = (List) b10.d0(serialDescriptor, 6, (KSerializer) hVarArr[6].getValue(), list);
                    i10 |= 64;
                    break;
                case 7:
                    list2 = (List) b10.d0(serialDescriptor, 7, (KSerializer) hVarArr[7].getValue(), list2);
                    i10 |= 128;
                    break;
                case 8:
                    z10 = b10.W(serialDescriptor, 8);
                    i10 |= RpcError.MAX_MESSAGE_BYTES;
                    break;
                case 9:
                    str = (String) b10.b0(serialDescriptor, 9, g1.f34588a, str);
                    i10 |= 512;
                    break;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(serialDescriptor);
        return new ExploreCollectionDetailsV4Response(i10, str2, str3, str4, str5, str6, str7, list, list2, z10, str, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ExploreCollectionDetailsV4Response value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.b b10 = encoder.b(serialDescriptor);
        ExploreCollectionDetailsV4Response.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
