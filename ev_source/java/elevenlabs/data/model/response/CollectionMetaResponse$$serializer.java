package io.elevenlabs.data.model.response;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import rd.c1;
import ur.a0;
import ur.g;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/response/CollectionMetaResponse.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/response/CollectionMetaResponse;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/response/CollectionMetaResponse;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@sn.c
/* loaded from: classes3.dex */
public final /* synthetic */ class CollectionMetaResponse$$serializer implements a0 {
    public static final CollectionMetaResponse$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CollectionMetaResponse$$serializer collectionMetaResponse$$serializer = new CollectionMetaResponse$$serializer();
        INSTANCE = collectionMetaResponse$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.response.CollectionMetaResponse", collectionMetaResponse$$serializer, 15);
        pluginGeneratedSerialDescriptor.b("id", false);
        pluginGeneratedSerialDescriptor.b("title", false);
        pluginGeneratedSerialDescriptor.b("subtitle", true);
        pluginGeneratedSerialDescriptor.b("description", true);
        pluginGeneratedSerialDescriptor.b("url", true);
        pluginGeneratedSerialDescriptor.b("language", true);
        pluginGeneratedSerialDescriptor.b("image_url", true);
        pluginGeneratedSerialDescriptor.b("last_opened_at_unix", true);
        pluginGeneratedSerialDescriptor.b("updated_at_unix", true);
        pluginGeneratedSerialDescriptor.b("has_unread", true);
        pluginGeneratedSerialDescriptor.b("category", true);
        pluginGeneratedSerialDescriptor.b("item_count", true);
        pluginGeneratedSerialDescriptor.b(ParameterNames.ICON, true);
        pluginGeneratedSerialDescriptor.b("is_owner", true);
        pluginGeneratedSerialDescriptor.b("in_user_library", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private CollectionMetaResponse$$serializer() {
    }

    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        g1 g1Var = g1.f34588a;
        KSerializer w6 = c1.w(g1Var);
        KSerializer w10 = c1.w(g1Var);
        KSerializer w11 = c1.w(g1Var);
        KSerializer w12 = c1.w(g1Var);
        KSerializer w13 = c1.w(g1Var);
        l0 l0Var = l0.f34611a;
        KSerializer w14 = c1.w(l0Var);
        KSerializer w15 = c1.w(l0Var);
        g gVar = g.f34583a;
        return new KSerializer[]{g1Var, g1Var, w6, w10, w11, w12, w13, w14, w15, c1.w(gVar), c1.w(g1Var), c1.w(l0Var), c1.w(g1Var), c1.w(gVar), c1.w(gVar)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0028. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final CollectionMetaResponse deserialize(Decoder decoder) {
        String str;
        String str2;
        Boolean bool;
        String str3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        b10.getClass();
        Boolean bool2 = null;
        Boolean bool3 = null;
        String str4 = null;
        String str5 = null;
        Long l4 = null;
        Boolean bool4 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Long l7 = null;
        Long l10 = null;
        String str11 = null;
        String str12 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    bool = bool3;
                    str3 = str7;
                    z6 = false;
                    str7 = str3;
                    bool3 = bool;
                case 0:
                    bool = bool3;
                    str3 = str7;
                    str11 = b10.q(serialDescriptor, 0);
                    i10 |= 1;
                    str6 = str6;
                    str7 = str3;
                    bool3 = bool;
                case 1:
                    bool = bool3;
                    str12 = b10.q(serialDescriptor, 1);
                    i10 |= 2;
                    str6 = str6;
                    bool3 = bool;
                case 2:
                    bool = bool3;
                    str3 = str7;
                    str6 = (String) b10.b0(serialDescriptor, 2, g1.f34588a, str6);
                    i10 |= 4;
                    str7 = str3;
                    bool3 = bool;
                case 3:
                    bool = bool3;
                    str7 = (String) b10.b0(serialDescriptor, 3, g1.f34588a, str7);
                    i10 |= 8;
                    str6 = str6;
                    bool3 = bool;
                case 4:
                    str = str6;
                    str2 = str7;
                    str8 = (String) b10.b0(serialDescriptor, 4, g1.f34588a, str8);
                    i10 |= 16;
                    str6 = str;
                    str7 = str2;
                case 5:
                    str = str6;
                    str2 = str7;
                    str9 = (String) b10.b0(serialDescriptor, 5, g1.f34588a, str9);
                    i10 |= 32;
                    str6 = str;
                    str7 = str2;
                case 6:
                    str = str6;
                    str2 = str7;
                    str10 = (String) b10.b0(serialDescriptor, 6, g1.f34588a, str10);
                    i10 |= 64;
                    str6 = str;
                    str7 = str2;
                case 7:
                    str = str6;
                    str2 = str7;
                    l7 = (Long) b10.b0(serialDescriptor, 7, l0.f34611a, l7);
                    i10 |= 128;
                    str6 = str;
                    str7 = str2;
                case 8:
                    str = str6;
                    str2 = str7;
                    l10 = (Long) b10.b0(serialDescriptor, 8, l0.f34611a, l10);
                    i10 |= RpcError.MAX_MESSAGE_BYTES;
                    str6 = str;
                    str7 = str2;
                case 9:
                    str = str6;
                    str2 = str7;
                    bool2 = (Boolean) b10.b0(serialDescriptor, 9, g.f34583a, bool2);
                    i10 |= 512;
                    str6 = str;
                    str7 = str2;
                case 10:
                    str = str6;
                    str2 = str7;
                    str5 = (String) b10.b0(serialDescriptor, 10, g1.f34588a, str5);
                    i10 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    str6 = str;
                    str7 = str2;
                case 11:
                    str = str6;
                    str2 = str7;
                    l4 = (Long) b10.b0(serialDescriptor, 11, l0.f34611a, l4);
                    i10 |= 2048;
                    str6 = str;
                    str7 = str2;
                case 12:
                    str = str6;
                    str2 = str7;
                    str4 = (String) b10.b0(serialDescriptor, 12, g1.f34588a, str4);
                    i10 |= 4096;
                    str6 = str;
                    str7 = str2;
                case 13:
                    str = str6;
                    str2 = str7;
                    bool3 = (Boolean) b10.b0(serialDescriptor, 13, g.f34583a, bool3);
                    i10 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    str6 = str;
                    str7 = str2;
                case 14:
                    str = str6;
                    str2 = str7;
                    bool4 = (Boolean) b10.b0(serialDescriptor, 14, g.f34583a, bool4);
                    i10 |= 16384;
                    str6 = str;
                    str7 = str2;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(serialDescriptor);
        return new CollectionMetaResponse(i10, str11, str12, str6, str7, str8, str9, str10, l7, l10, bool2, str5, l4, str4, bool3, bool4, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, CollectionMetaResponse value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.b b10 = encoder.b(serialDescriptor);
        CollectionMetaResponse.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
