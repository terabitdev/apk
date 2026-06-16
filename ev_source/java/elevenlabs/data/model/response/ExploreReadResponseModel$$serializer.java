package io.elevenlabs.data.model.response;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.livekit.android.rpc.RpcError;
import java.util.Map;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import rd.c1;
import sn.h;
import ur.a0;
import ur.f0;
import ur.g1;
import ur.r;
import ur.t0;
import ur.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/response/ExploreReadResponseModel.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/response/ExploreReadResponseModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/response/ExploreReadResponseModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@sn.c
/* loaded from: classes3.dex */
public final /* synthetic */ class ExploreReadResponseModel$$serializer implements a0 {
    public static final ExploreReadResponseModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ExploreReadResponseModel$$serializer exploreReadResponseModel$$serializer = new ExploreReadResponseModel$$serializer();
        INSTANCE = exploreReadResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.response.ExploreReadResponseModel", exploreReadResponseModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.b("read_id", false);
        pluginGeneratedSerialDescriptor.b("title", true);
        pluginGeneratedSerialDescriptor.b("author", true);
        pluginGeneratedSerialDescriptor.b("article_image_url", true);
        pluginGeneratedSerialDescriptor.b("audio_duration_seconds", true);
        pluginGeneratedSerialDescriptor.b("average_rating", true);
        pluginGeneratedSerialDescriptor.b("total_rating_count", true);
        pluginGeneratedSerialDescriptor.b("pricing_type", true);
        pluginGeneratedSerialDescriptor.b("list_price", true);
        pluginGeneratedSerialDescriptor.b(FirebaseAnalytics.Param.CURRENCY, true);
        pluginGeneratedSerialDescriptor.b("added_to_library_count", true);
        pluginGeneratedSerialDescriptor.b("purchase_config", true);
        pluginGeneratedSerialDescriptor.b("preview_audio_url", true);
        pluginGeneratedSerialDescriptor.b("cover_image_urls", true);
        pluginGeneratedSerialDescriptor.b("cover_aspect_ratio", true);
        pluginGeneratedSerialDescriptor.b("blur_placeholder", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ExploreReadResponseModel$$serializer() {
    }

    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = ExploreReadResponseModel.$childSerializers;
        g1 g1Var = g1.f34588a;
        KSerializer w6 = c1.w(g1Var);
        KSerializer w10 = c1.w(g1Var);
        KSerializer w11 = c1.w(g1Var);
        z zVar = z.f34681a;
        KSerializer w12 = c1.w(zVar);
        KSerializer w13 = c1.w(zVar);
        f0 f0Var = f0.f34579a;
        return new KSerializer[]{g1Var, w6, w10, w11, w12, w13, c1.w(f0Var), g1Var, c1.w(zVar), c1.w(g1Var), c1.w(f0Var), c1.w(ReadPurchaseConfigResponseModel$$serializer.INSTANCE), c1.w(g1Var), c1.w((KSerializer) hVarArr[13].getValue()), c1.w(r.f34640a), c1.w(g1Var)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0030. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final ExploreReadResponseModel deserialize(Decoder decoder) {
        h[] hVarArr;
        String str;
        String str2;
        Map map;
        String str3;
        String str4;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        hVarArr = ExploreReadResponseModel.$childSerializers;
        b10.getClass();
        Float f10 = null;
        Map map2 = null;
        String str5 = null;
        ReadPurchaseConfigResponseModel readPurchaseConfigResponseModel = null;
        String str6 = null;
        Integer num = null;
        Double d10 = null;
        String str7 = null;
        String str8 = null;
        Float f11 = null;
        Float f12 = null;
        Integer num2 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        int i10 = 0;
        boolean z6 = true;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    str = str7;
                    str2 = str8;
                    z6 = false;
                    str7 = str;
                    str8 = str2;
                case 0:
                    map = map2;
                    str3 = str7;
                    str4 = str8;
                    str10 = b10.q(serialDescriptor, 0);
                    i10 |= 1;
                    str7 = str3;
                    str8 = str4;
                    map2 = map;
                case 1:
                    map = map2;
                    str4 = str8;
                    str3 = str7;
                    str12 = (String) b10.b0(serialDescriptor, 1, g1.f34588a, str12);
                    i10 |= 2;
                    str7 = str3;
                    str8 = str4;
                    map2 = map;
                case 2:
                    map = map2;
                    str4 = str8;
                    str7 = (String) b10.b0(serialDescriptor, 2, g1.f34588a, str7);
                    i10 |= 4;
                    str8 = str4;
                    map2 = map;
                case 3:
                    map = map2;
                    str8 = (String) b10.b0(serialDescriptor, 3, g1.f34588a, str8);
                    i10 |= 8;
                    str7 = str7;
                    map2 = map;
                case 4:
                    str = str7;
                    str2 = str8;
                    f11 = (Float) b10.b0(serialDescriptor, 4, z.f34681a, f11);
                    i10 |= 16;
                    str7 = str;
                    str8 = str2;
                case 5:
                    str = str7;
                    str2 = str8;
                    f12 = (Float) b10.b0(serialDescriptor, 5, z.f34681a, f12);
                    i10 |= 32;
                    str7 = str;
                    str8 = str2;
                case 6:
                    str = str7;
                    str2 = str8;
                    num2 = (Integer) b10.b0(serialDescriptor, 6, f0.f34579a, num2);
                    i10 |= 64;
                    str7 = str;
                    str8 = str2;
                case 7:
                    str11 = b10.q(serialDescriptor, 7);
                    i10 |= 128;
                    str7 = str7;
                case 8:
                    str = str7;
                    str2 = str8;
                    f10 = (Float) b10.b0(serialDescriptor, 8, z.f34681a, f10);
                    i10 |= RpcError.MAX_MESSAGE_BYTES;
                    str7 = str;
                    str8 = str2;
                case 9:
                    str = str7;
                    str2 = str8;
                    str6 = (String) b10.b0(serialDescriptor, 9, g1.f34588a, str6);
                    i10 |= 512;
                    str7 = str;
                    str8 = str2;
                case 10:
                    str = str7;
                    str2 = str8;
                    num = (Integer) b10.b0(serialDescriptor, 10, f0.f34579a, num);
                    i10 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    str7 = str;
                    str8 = str2;
                case 11:
                    str = str7;
                    str2 = str8;
                    readPurchaseConfigResponseModel = (ReadPurchaseConfigResponseModel) b10.b0(serialDescriptor, 11, ReadPurchaseConfigResponseModel$$serializer.INSTANCE, readPurchaseConfigResponseModel);
                    i10 |= 2048;
                    str7 = str;
                    str8 = str2;
                case 12:
                    str = str7;
                    str2 = str8;
                    str5 = (String) b10.b0(serialDescriptor, 12, g1.f34588a, str5);
                    i10 |= 4096;
                    str7 = str;
                    str8 = str2;
                case 13:
                    str = str7;
                    str2 = str8;
                    map2 = (Map) b10.b0(serialDescriptor, 13, (KSerializer) hVarArr[13].getValue(), map2);
                    i10 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    str7 = str;
                    str8 = str2;
                case 14:
                    str = str7;
                    str2 = str8;
                    d10 = (Double) b10.b0(serialDescriptor, 14, r.f34640a, d10);
                    i10 |= 16384;
                    str7 = str;
                    str8 = str2;
                case 15:
                    str = str7;
                    str2 = str8;
                    str9 = (String) b10.b0(serialDescriptor, 15, g1.f34588a, str9);
                    i10 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                    str7 = str;
                    str8 = str2;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        String str13 = str8;
        String str14 = str12;
        b10.c(serialDescriptor);
        Double d11 = d10;
        return new ExploreReadResponseModel(i10, str10, str14, str7, str13, f11, f12, num2, str11, f10, str6, num, readPurchaseConfigResponseModel, str5, map2, d11, str9, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ExploreReadResponseModel value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.b b10 = encoder.b(serialDescriptor);
        ExploreReadResponseModel.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
