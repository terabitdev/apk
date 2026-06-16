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
import tr.b;
import ur.a0;
import ur.g;
import ur.g1;
import ur.l0;
import ur.r;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/ReadMetadataChapterDBModel.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/ReadMetadataChapterDBModel;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/ReadMetadataChapterDBModel;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/ReadMetadataChapterDBModel;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes3.dex */
public final /* synthetic */ class ReadMetadataChapterDBModel$$serializer implements a0 {
    public static final ReadMetadataChapterDBModel$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        ReadMetadataChapterDBModel$$serializer readMetadataChapterDBModel$$serializer = new ReadMetadataChapterDBModel$$serializer();
        INSTANCE = readMetadataChapterDBModel$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.ReadMetadataChapterDBModel", readMetadataChapterDBModel$$serializer, 8);
        pluginGeneratedSerialDescriptor.b("chapter_name", false);
        pluginGeneratedSerialDescriptor.b("word_count", false);
        pluginGeneratedSerialDescriptor.b("char_count", false);
        pluginGeneratedSerialDescriptor.b("starting_char_offset", false);
        pluginGeneratedSerialDescriptor.b("has_parsed_html", true);
        pluginGeneratedSerialDescriptor.b("has_summary", true);
        pluginGeneratedSerialDescriptor.b("duration_seconds", true);
        pluginGeneratedSerialDescriptor.b("file_number", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private ReadMetadataChapterDBModel$$serializer() {
    }

    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        g1 g1Var = g1.f34588a;
        g gVar = g.f34583a;
        KSerializer w6 = c1.w(gVar);
        KSerializer w10 = c1.w(gVar);
        KSerializer w11 = c1.w(r.f34640a);
        KSerializer w12 = c1.w(g1Var);
        l0 l0Var = l0.f34611a;
        return new KSerializer[]{g1Var, l0Var, l0Var, l0Var, w6, w10, w11, w12};
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:4:0x0020. Please report as an issue. */
    @Override // kotlinx.serialization.KSerializer
    public final ReadMetadataChapterDBModel deserialize(Decoder decoder) {
        boolean z6;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        b10.getClass();
        Boolean bool = null;
        String str = null;
        String str2 = null;
        long j4 = 0;
        long j10 = 0;
        long j11 = 0;
        int i10 = 0;
        boolean z10 = true;
        Boolean bool2 = null;
        Double d10 = null;
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
                    j4 = b10.i(serialDescriptor, 1);
                    i10 |= 2;
                case 2:
                    j10 = b10.i(serialDescriptor, 2);
                    i10 |= 4;
                case 3:
                    j11 = b10.i(serialDescriptor, 3);
                    i10 |= 8;
                case 4:
                    z6 = z10;
                    bool = (Boolean) b10.b0(serialDescriptor, 4, g.f34583a, bool);
                    i10 |= 16;
                    z10 = z6;
                case 5:
                    z6 = z10;
                    bool2 = (Boolean) b10.b0(serialDescriptor, 5, g.f34583a, bool2);
                    i10 |= 32;
                    z10 = z6;
                case 6:
                    z6 = z10;
                    d10 = (Double) b10.b0(serialDescriptor, 6, r.f34640a, d10);
                    i10 |= 64;
                    z10 = z6;
                case 7:
                    z6 = z10;
                    str = (String) b10.b0(serialDescriptor, 7, g1.f34588a, str);
                    i10 |= 128;
                    z10 = z6;
                default:
                    ha.a.e(s10);
                    return null;
            }
        }
        b10.c(serialDescriptor);
        return new ReadMetadataChapterDBModel(i10, str2, j4, j10, j11, bool, bool2, d10, str, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, ReadMetadataChapterDBModel value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b b10 = encoder.b(serialDescriptor);
        ReadMetadataChapterDBModel.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
