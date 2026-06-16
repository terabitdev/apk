package io.elevenlabs.data.model.response;

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
import rd.c1;
import sn.h;
import ur.a0;
import ur.g;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/response/ReaderAppConfigResponseModel.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/response/ReaderAppConfigResponseModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/response/ReaderAppConfigResponseModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/response/ReaderAppConfigResponseModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@sn.c
/* loaded from: classes3.dex */
public final /* synthetic */ class ReaderAppConfigResponseModel$$serializer implements a0 {
    public static final ReaderAppConfigResponseModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReaderAppConfigResponseModel$$serializer readerAppConfigResponseModel$$serializer = new ReaderAppConfigResponseModel$$serializer();
        INSTANCE = readerAppConfigResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.response.ReaderAppConfigResponseModel", readerAppConfigResponseModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.b("default_voice", false);
        pluginGeneratedSerialDescriptor.b("android_notification_channels", false);
        pluginGeneratedSerialDescriptor.b("feature_flags", true);
        pluginGeneratedSerialDescriptor.b("device_feature_flags", true);
        pluginGeneratedSerialDescriptor.b("rn_min_app_version", true);
        pluginGeneratedSerialDescriptor.b("android_min_app_version", true);
        pluginGeneratedSerialDescriptor.b("ios_min_app_version", true);
        pluginGeneratedSerialDescriptor.b("player_buffer_max_length_seconds", true);
        pluginGeneratedSerialDescriptor.b("player_buffer_min_length_seconds", true);
        pluginGeneratedSerialDescriptor.b("import_tutorial_ios_url", true);
        pluginGeneratedSerialDescriptor.b("report_problem_url", true);
        pluginGeneratedSerialDescriptor.b("copyright_takedown_url", true);
        pluginGeneratedSerialDescriptor.b("content_provider_waitlist_url", true);
        pluginGeneratedSerialDescriptor.b("android_rtl_canvas_validation", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReaderAppConfigResponseModel$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = ReaderAppConfigResponseModel.$childSerializers;
        g1 g1Var = g1.f34588a;
        l0 l0Var = l0.f34611a;
        return new KSerializer[]{g1Var, hVarArr[1].getValue(), c1.w((KSerializer) hVarArr[2].getValue()), c1.w((KSerializer) hVarArr[3].getValue()), c1.w(g1Var), c1.w(g1Var), c1.w(g1Var), c1.w(l0Var), c1.w(l0Var), c1.w(g1Var), c1.w(g1Var), c1.w(g1Var), c1.w(g1Var), g.f34583a};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002e. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final ReaderAppConfigResponseModel deserialize(Decoder decoder) {
        h[] hVarArr;
        String str;
        int i10;
        int i11;
        String str2;
        Map map;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        hVarArr = ReaderAppConfigResponseModel.$childSerializers;
        b10.getClass();
        Long l4 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        Map map2 = null;
        Map map3 = null;
        Map map4 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        Long l7 = null;
        int i12 = 0;
        int i13 = 1;
        boolean z6 = true;
        boolean z10 = false;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    str = str7;
                    i13 = i13;
                    i12 = i12;
                    z6 = false;
                    str7 = str;
                case 0:
                    int i14 = i13;
                    int i15 = i12;
                    i10 = i14;
                    str = b10.q(serialDescriptor, 0);
                    i11 = i15 | 1;
                    i13 = i10;
                    i12 = i11;
                    str7 = str;
                case 1:
                    str = str7;
                    Map map5 = map2;
                    KSerializer kSerializer = (KSerializer) hVarArr[i13].getValue();
                    int i16 = i13;
                    int i17 = i12;
                    i10 = i16;
                    map2 = (Map) b10.d0(serialDescriptor, i10, kSerializer, map5);
                    i11 = i17 | 2;
                    i13 = i10;
                    i12 = i11;
                    str7 = str;
                case 2:
                    str2 = str7;
                    map = map2;
                    map3 = (Map) b10.b0(serialDescriptor, 2, (KSerializer) hVarArr[2].getValue(), map3);
                    i12 |= 4;
                    str7 = str2;
                    map2 = map;
                case 3:
                    str2 = str7;
                    map = map2;
                    map4 = (Map) b10.b0(serialDescriptor, 3, (KSerializer) hVarArr[3].getValue(), map4);
                    i12 |= 8;
                    str7 = str2;
                    map2 = map;
                case 4:
                    str2 = str7;
                    map = map2;
                    str8 = (String) b10.b0(serialDescriptor, 4, g1.f34588a, str8);
                    i12 |= 16;
                    str7 = str2;
                    map2 = map;
                case 5:
                    str2 = str7;
                    map = map2;
                    str9 = (String) b10.b0(serialDescriptor, 5, g1.f34588a, str9);
                    i12 |= 32;
                    str7 = str2;
                    map2 = map;
                case 6:
                    str2 = str7;
                    map = map2;
                    str10 = (String) b10.b0(serialDescriptor, 6, g1.f34588a, str10);
                    i12 |= 64;
                    str7 = str2;
                    map2 = map;
                case 7:
                    str2 = str7;
                    map = map2;
                    l7 = (Long) b10.b0(serialDescriptor, 7, l0.f34611a, l7);
                    i12 |= 128;
                    str7 = str2;
                    map2 = map;
                case 8:
                    str2 = str7;
                    map = map2;
                    l4 = (Long) b10.b0(serialDescriptor, 8, l0.f34611a, l4);
                    i12 |= RpcError.MAX_MESSAGE_BYTES;
                    str7 = str2;
                    map2 = map;
                case 9:
                    str2 = str7;
                    map = map2;
                    str5 = (String) b10.b0(serialDescriptor, 9, g1.f34588a, str5);
                    i12 |= 512;
                    str7 = str2;
                    map2 = map;
                case 10:
                    str2 = str7;
                    map = map2;
                    str6 = (String) b10.b0(serialDescriptor, 10, g1.f34588a, str6);
                    i12 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    str7 = str2;
                    map2 = map;
                case 11:
                    str2 = str7;
                    map = map2;
                    str4 = (String) b10.b0(serialDescriptor, 11, g1.f34588a, str4);
                    i12 |= 2048;
                    str7 = str2;
                    map2 = map;
                case 12:
                    str2 = str7;
                    map = map2;
                    str3 = (String) b10.b0(serialDescriptor, 12, g1.f34588a, str3);
                    i12 |= 4096;
                    str7 = str2;
                    map2 = map;
                case 13:
                    str = str7;
                    z10 = b10.W(serialDescriptor, 13);
                    i12 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    str7 = str;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(serialDescriptor);
        return new ReaderAppConfigResponseModel(i12, str7, map2, map3, map4, str8, str9, str10, l7, l4, str5, str6, str4, str3, z10, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ReaderAppConfigResponseModel value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.b b10 = encoder.b(serialDescriptor);
        ReaderAppConfigResponseModel.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
