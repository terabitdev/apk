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
import ur.f0;
import ur.g1;
import ur.l0;
import ur.r;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/response/BookmarkResponseModel.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/response/BookmarkResponseModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/response/BookmarkResponseModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/response/BookmarkResponseModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@sn.c
/* loaded from: classes3.dex */
public final /* synthetic */ class BookmarkResponseModel$$serializer implements a0 {
    public static final BookmarkResponseModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BookmarkResponseModel$$serializer bookmarkResponseModel$$serializer = new BookmarkResponseModel$$serializer();
        INSTANCE = bookmarkResponseModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.response.BookmarkResponseModel", bookmarkResponseModel$$serializer, 11);
        pluginGeneratedSerialDescriptor.b("bookmark_id", false);
        pluginGeneratedSerialDescriptor.b("read_id", false);
        pluginGeneratedSerialDescriptor.b("start_offset_inclusive", false);
        pluginGeneratedSerialDescriptor.b("end_offset_exclusive", false);
        pluginGeneratedSerialDescriptor.b(ParameterNames.TEXT, false);
        pluginGeneratedSerialDescriptor.b("created_at_unix", false);
        pluginGeneratedSerialDescriptor.b("updated_at_unix", false);
        pluginGeneratedSerialDescriptor.b("note", true);
        pluginGeneratedSerialDescriptor.b("chapter_index", true);
        pluginGeneratedSerialDescriptor.b("start_time_seconds", true);
        pluginGeneratedSerialDescriptor.b("end_time_seconds", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BookmarkResponseModel$$serializer() {
    }

    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        g1 g1Var = g1.f34588a;
        KSerializer w6 = c1.w(g1Var);
        KSerializer w10 = c1.w(f0.f34579a);
        r rVar = r.f34640a;
        KSerializer w11 = c1.w(rVar);
        KSerializer w12 = c1.w(rVar);
        l0 l0Var = l0.f34611a;
        return new KSerializer[]{g1Var, g1Var, l0Var, l0Var, g1Var, l0Var, l0Var, w6, w10, w11, w12};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0025. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final BookmarkResponseModel deserialize(Decoder decoder) {
        boolean z6;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        b10.getClass();
        String str = null;
        Double d10 = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        long j4 = 0;
        long j10 = 0;
        long j11 = 0;
        long j12 = 0;
        int i10 = 0;
        boolean z10 = true;
        Integer num = null;
        Double d11 = null;
        while (z10) {
            int s10 = b10.s(serialDescriptor);
            switch (s10) {
                case -1:
                    z10 = false;
                case 0:
                    z6 = z10;
                    str2 = b10.q(serialDescriptor, 0);
                    i10 |= 1;
                    z10 = z6;
                case 1:
                    str3 = b10.q(serialDescriptor, 1);
                    i10 |= 2;
                case 2:
                    j4 = b10.i(serialDescriptor, 2);
                    i10 |= 4;
                case 3:
                    j10 = b10.i(serialDescriptor, 3);
                    i10 |= 8;
                case 4:
                    str4 = b10.q(serialDescriptor, 4);
                    i10 |= 16;
                case 5:
                    j11 = b10.i(serialDescriptor, 5);
                    i10 |= 32;
                case 6:
                    j12 = b10.i(serialDescriptor, 6);
                    i10 |= 64;
                case 7:
                    z6 = z10;
                    str = (String) b10.b0(serialDescriptor, 7, g1.f34588a, str);
                    i10 |= 128;
                    z10 = z6;
                case 8:
                    z6 = z10;
                    num = (Integer) b10.b0(serialDescriptor, 8, f0.f34579a, num);
                    i10 |= RpcError.MAX_MESSAGE_BYTES;
                    z10 = z6;
                case 9:
                    z6 = z10;
                    d11 = (Double) b10.b0(serialDescriptor, 9, r.f34640a, d11);
                    i10 |= 512;
                    z10 = z6;
                case 10:
                    z6 = z10;
                    d10 = (Double) b10.b0(serialDescriptor, 10, r.f34640a, d10);
                    i10 |= UserMetadata.MAX_ATTRIBUTE_SIZE;
                    z10 = z6;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(serialDescriptor);
        return new BookmarkResponseModel(i10, str2, str3, j4, j10, str4, j11, j12, str, num, d11, d10, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BookmarkResponseModel value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.b b10 = encoder.b(serialDescriptor);
        BookmarkResponseModel.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
