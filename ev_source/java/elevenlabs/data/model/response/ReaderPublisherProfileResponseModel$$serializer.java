package io.elevenlabs.data.model.response;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.elevenlabs.data.model.response.ReaderPublisherProfileResponseModel;
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
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/response/ReaderPublisherProfileResponseModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@sn.c
/* loaded from: classes3.dex */
public final /* synthetic */ class ReaderPublisherProfileResponseModel$$serializer implements a0 {
    public static final ReaderPublisherProfileResponseModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReaderPublisherProfileResponseModel$$serializer readerPublisherProfileResponseModel$$serializer = new ReaderPublisherProfileResponseModel$$serializer();
        INSTANCE = readerPublisherProfileResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.response.ReaderPublisherProfileResponseModel", readerPublisherProfileResponseModel$$serializer, 14);
        pluginGeneratedSerialDescriptor.b("profile_id", false);
        pluginGeneratedSerialDescriptor.b(DiagnosticsEntry.NAME_KEY, false);
        pluginGeneratedSerialDescriptor.b("created_at_unix", false);
        pluginGeneratedSerialDescriptor.b("updated_at_unix", false);
        pluginGeneratedSerialDescriptor.b("bio", true);
        pluginGeneratedSerialDescriptor.b("avatar_url", true);
        pluginGeneratedSerialDescriptor.b("date_of_birth", true);
        pluginGeneratedSerialDescriptor.b(FirebaseAnalytics.Param.ORIGIN, true);
        pluginGeneratedSerialDescriptor.b("website_link", true);
        pluginGeneratedSerialDescriptor.b("social_links", true);
        pluginGeneratedSerialDescriptor.b("pen_name", true);
        pluginGeneratedSerialDescriptor.b("profile_slug", true);
        pluginGeneratedSerialDescriptor.b("bio_moderation_status", true);
        pluginGeneratedSerialDescriptor.b("language", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReaderPublisherProfileResponseModel$$serializer() {
    }

    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = ReaderPublisherProfileResponseModel.$childSerializers;
        g1 g1Var = g1.f34588a;
        KSerializer w6 = c1.w(g1Var);
        KSerializer w10 = c1.w(g1Var);
        KSerializer w11 = c1.w(g1Var);
        KSerializer w12 = c1.w(g1Var);
        KSerializer w13 = c1.w(g1Var);
        KSerializer w14 = c1.w((KSerializer) hVarArr[9].getValue());
        KSerializer w15 = c1.w(g1Var);
        KSerializer w16 = c1.w(g1Var);
        KSerializer w17 = c1.w((KSerializer) hVarArr[12].getValue());
        KSerializer w18 = c1.w((KSerializer) hVarArr[13].getValue());
        l0 l0Var = l0.f34611a;
        return new KSerializer[]{g1Var, g1Var, l0Var, l0Var, w6, w10, w11, w12, w13, w14, w15, w16, w17, w18};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002d. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final ReaderPublisherProfileResponseModel deserialize(Decoder decoder) {
        h[] hVarArr;
        String str;
        h[] hVarArr2;
        h[] hVarArr3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        hVarArr = ReaderPublisherProfileResponseModel.$childSerializers;
        b10.getClass();
        String str2 = null;
        ReaderPublisherProfileResponseModel.Language language = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        List list = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        long j4 = 0;
        long j10 = 0;
        int i10 = 0;
        boolean z6 = true;
        String str10 = null;
        String str11 = null;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    str = str5;
                    z6 = false;
                    str5 = str;
                case 0:
                    hVarArr3 = hVarArr;
                    i10 |= 1;
                    str5 = b10.q(serialDescriptor, 0);
                    hVarArr = hVarArr3;
                case 1:
                    hVarArr3 = hVarArr;
                    str6 = b10.q(serialDescriptor, 1);
                    i10 |= 2;
                    hVarArr = hVarArr3;
                case 2:
                    hVarArr3 = hVarArr;
                    j4 = b10.i(serialDescriptor, 2);
                    i10 |= 4;
                    hVarArr = hVarArr3;
                case 3:
                    hVarArr3 = hVarArr;
                    j10 = b10.i(serialDescriptor, 3);
                    i10 |= 8;
                    hVarArr = hVarArr3;
                case 4:
                    hVarArr2 = hVarArr;
                    str = str5;
                    str2 = (String) b10.b0(serialDescriptor, 4, g1.f34588a, str2);
                    i10 |= 16;
                    hVarArr = hVarArr2;
                    str5 = str;
                case 5:
                    hVarArr2 = hVarArr;
                    str = str5;
                    str10 = (String) b10.b0(serialDescriptor, 5, g1.f34588a, str10);
                    i10 |= 32;
                    hVarArr = hVarArr2;
                    str5 = str;
                case 6:
                    hVarArr2 = hVarArr;
                    str = str5;
                    str11 = (String) b10.b0(serialDescriptor, 6, g1.f34588a, str11);
                    i10 |= 64;
                    hVarArr = hVarArr2;
                    str5 = str;
                case 7:
                    hVarArr2 = hVarArr;
                    str = str5;
                    str3 = (String) b10.b0(serialDescriptor, 7, g1.f34588a, str3);
                    i10 |= 128;
                    hVarArr = hVarArr2;
                    str5 = str;
                case 8:
                    hVarArr2 = hVarArr;
                    str = str5;
                    str4 = (String) b10.b0(serialDescriptor, 8, g1.f34588a, str4);
                    i10 |= RpcError.MAX_MESSAGE_BYTES;
                    hVarArr = hVarArr2;
                    str5 = str;
                case 9:
                    hVarArr2 = hVarArr;
                    str = str5;
                    list = (List) b10.b0(serialDescriptor, 9, (KSerializer) hVarArr2[9].getValue(), list);
                    i10 |= 512;
                    hVarArr = hVarArr2;
                    str5 = str;
                case 10:
                    hVarArr2 = hVarArr;
                    str = str5;
                    str7 = (String) b10.b0(serialDescriptor, 10, g1.f34588a, str7);
                    i10 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    hVarArr = hVarArr2;
                    str5 = str;
                case 11:
                    hVarArr2 = hVarArr;
                    str = str5;
                    str8 = (String) b10.b0(serialDescriptor, 11, g1.f34588a, str8);
                    i10 |= 2048;
                    hVarArr = hVarArr2;
                    str5 = str;
                case 12:
                    hVarArr2 = hVarArr;
                    str = str5;
                    str9 = (String) b10.b0(serialDescriptor, 12, (KSerializer) hVarArr2[12].getValue(), str9);
                    i10 |= 4096;
                    hVarArr = hVarArr2;
                    str5 = str;
                case 13:
                    hVarArr2 = hVarArr;
                    str = str5;
                    language = (ReaderPublisherProfileResponseModel.Language) b10.b0(serialDescriptor, 13, (KSerializer) hVarArr2[13].getValue(), language);
                    i10 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    hVarArr = hVarArr2;
                    str5 = str;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(serialDescriptor);
        return new ReaderPublisherProfileResponseModel(i10, str5, str6, j4, j10, str2, str10, str11, str3, str4, list, str7, str8, str9, language, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ReaderPublisherProfileResponseModel value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.b b10 = encoder.b(serialDescriptor);
        ReaderPublisherProfileResponseModel.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
