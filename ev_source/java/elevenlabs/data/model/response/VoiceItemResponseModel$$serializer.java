package io.elevenlabs.data.model.response;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.livekit.android.rpc.RpcError;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;
import rd.c1;
import ur.a0;
import ur.g;
import ur.g1;
import ur.l0;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/response/VoiceItemResponseModel.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/response/VoiceItemResponseModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/response/VoiceItemResponseModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@sn.c
/* loaded from: classes3.dex */
public final /* synthetic */ class VoiceItemResponseModel$$serializer implements a0 {
    public static final VoiceItemResponseModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VoiceItemResponseModel$$serializer voiceItemResponseModel$$serializer = new VoiceItemResponseModel$$serializer();
        INSTANCE = voiceItemResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.response.VoiceItemResponseModel", voiceItemResponseModel$$serializer, 16);
        pluginGeneratedSerialDescriptor.b("voice_id", false);
        pluginGeneratedSerialDescriptor.b(DiagnosticsEntry.NAME_KEY, false);
        pluginGeneratedSerialDescriptor.b("accent", false);
        pluginGeneratedSerialDescriptor.b("gender", false);
        pluginGeneratedSerialDescriptor.b("age", false);
        pluginGeneratedSerialDescriptor.b("descriptive", false);
        pluginGeneratedSerialDescriptor.b("use_case", false);
        pluginGeneratedSerialDescriptor.b("language", false);
        pluginGeneratedSerialDescriptor.b("from_voice_library", false);
        pluginGeneratedSerialDescriptor.b("category", true);
        pluginGeneratedSerialDescriptor.b("favorited_at_unix", true);
        pluginGeneratedSerialDescriptor.b("created_at_unix", true);
        pluginGeneratedSerialDescriptor.b("description", true);
        pluginGeneratedSerialDescriptor.b("preview_url", true);
        pluginGeneratedSerialDescriptor.b("image_url", true);
        pluginGeneratedSerialDescriptor.b("owner_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private VoiceItemResponseModel$$serializer() {
    }

    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        g1 g1Var = g1.f34588a;
        l0 l0Var = l0.f34611a;
        return new KSerializer[]{g1Var, g1Var, g1Var, g1Var, g1Var, g1Var, g1Var, g1Var, g.f34583a, g1Var, c1.w(l0Var), c1.w(l0Var), c1.w(g1Var), c1.w(g1Var), c1.w(g1Var), c1.w(g1Var)};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x002a. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final VoiceItemResponseModel deserialize(Decoder decoder) {
        String str;
        String str2;
        String str3;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        b10.getClass();
        Long l4 = null;
        String str4 = null;
        String str5 = null;
        Long l7 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        String str9 = null;
        String str10 = null;
        String str11 = null;
        String str12 = null;
        String str13 = null;
        String str14 = null;
        String str15 = null;
        String str16 = null;
        int i10 = 0;
        boolean z6 = true;
        boolean z10 = false;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    str = str8;
                    z6 = false;
                    str8 = str;
                case 0:
                    str2 = str7;
                    str = str8;
                    str16 = b10.q(serialDescriptor, 0);
                    i10 |= 1;
                    str7 = str2;
                    str8 = str;
                case 1:
                    str = str8;
                    i10 |= 2;
                    str7 = b10.q(serialDescriptor, 1);
                    str8 = str;
                case 2:
                    str3 = str7;
                    str8 = b10.q(serialDescriptor, 2);
                    i10 |= 4;
                    str7 = str3;
                case 3:
                    str3 = str7;
                    str9 = b10.q(serialDescriptor, 3);
                    i10 |= 8;
                    str7 = str3;
                case 4:
                    str3 = str7;
                    str10 = b10.q(serialDescriptor, 4);
                    i10 |= 16;
                    str7 = str3;
                case 5:
                    str3 = str7;
                    str11 = b10.q(serialDescriptor, 5);
                    i10 |= 32;
                    str7 = str3;
                case 6:
                    str3 = str7;
                    str12 = b10.q(serialDescriptor, 6);
                    i10 |= 64;
                    str7 = str3;
                case 7:
                    str3 = str7;
                    str13 = b10.q(serialDescriptor, 7);
                    i10 |= 128;
                    str7 = str3;
                case 8:
                    str3 = str7;
                    z10 = b10.W(serialDescriptor, 8);
                    i10 |= RpcError.MAX_MESSAGE_BYTES;
                    str7 = str3;
                case 9:
                    str3 = str7;
                    str15 = b10.q(serialDescriptor, 9);
                    i10 |= 512;
                    str7 = str3;
                case 10:
                    str2 = str7;
                    str = str8;
                    l4 = (Long) b10.b0(serialDescriptor, 10, l0.f34611a, l4);
                    i10 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    str7 = str2;
                    str8 = str;
                case 11:
                    str2 = str7;
                    str = str8;
                    l7 = (Long) b10.b0(serialDescriptor, 11, l0.f34611a, l7);
                    i10 |= 2048;
                    str7 = str2;
                    str8 = str;
                case 12:
                    str2 = str7;
                    str = str8;
                    str6 = (String) b10.b0(serialDescriptor, 12, g1.f34588a, str6);
                    i10 |= 4096;
                    str7 = str2;
                    str8 = str;
                case 13:
                    str2 = str7;
                    str = str8;
                    str14 = (String) b10.b0(serialDescriptor, 13, g1.f34588a, str14);
                    i10 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    str7 = str2;
                    str8 = str;
                case 14:
                    str2 = str7;
                    str = str8;
                    str5 = (String) b10.b0(serialDescriptor, 14, g1.f34588a, str5);
                    i10 |= 16384;
                    str7 = str2;
                    str8 = str;
                case 15:
                    str2 = str7;
                    str = str8;
                    str4 = (String) b10.b0(serialDescriptor, 15, g1.f34588a, str4);
                    i10 |= PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS;
                    str7 = str2;
                    str8 = str;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(serialDescriptor);
        return new VoiceItemResponseModel(i10, str16, str7, str8, str9, str10, str11, str12, str13, z10, str15, l4, l7, str6, str14, str5, str4, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, VoiceItemResponseModel value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.b b10 = encoder.b(serialDescriptor);
        VoiceItemResponseModel.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
