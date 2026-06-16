package io.elevenlabs.data.model;

import io.elevenlabs.data.model.BrowserExtensionConfig;
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
import ur.g;
import ur.t0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"io/elevenlabs/data/model/BrowserExtensionConfig.$serializer", "Lur/a0;", "Lio/elevenlabs/data/model/BrowserExtensionConfig;", "<init>", "()V", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lsn/z;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lio/elevenlabs/data/model/BrowserExtensionConfig;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lio/elevenlabs/data/model/BrowserExtensionConfig;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
@c
/* loaded from: classes3.dex */
public final /* synthetic */ class BrowserExtensionConfig$$serializer implements a0 {
    public static final BrowserExtensionConfig$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BrowserExtensionConfig$$serializer browserExtensionConfig$$serializer = new BrowserExtensionConfig$$serializer();
        INSTANCE = browserExtensionConfig$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("io.elevenlabs.data.model.BrowserExtensionConfig", browserExtensionConfig$$serializer, 5);
        pluginGeneratedSerialDescriptor.b("auto_import_epub", true);
        pluginGeneratedSerialDescriptor.b("auto_import_pdf", true);
        pluginGeneratedSerialDescriptor.b("auto_import_txt", true);
        pluginGeneratedSerialDescriptor.b("auto_categorize", true);
        pluginGeneratedSerialDescriptor.b("review_prompt_status", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    private BrowserExtensionConfig$$serializer() {
    }

    @Override // ur.a0
    public final KSerializer[] childSerializers() {
        h[] hVarArr;
        hVarArr = BrowserExtensionConfig.$childSerializers;
        g gVar = g.f34583a;
        return new KSerializer[]{c1.w(gVar), c1.w(gVar), c1.w(gVar), c1.w(gVar), c1.w((KSerializer) hVarArr[4].getValue())};
    }

    @Override // kotlinx.serialization.KSerializer
    public final BrowserExtensionConfig deserialize(Decoder decoder) {
        h[] hVarArr;
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        tr.a b10 = decoder.b(serialDescriptor);
        hVarArr = BrowserExtensionConfig.$childSerializers;
        b10.getClass();
        int i10 = 0;
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Boolean bool4 = null;
        BrowserExtensionConfig.ReviewPromptStatus reviewPromptStatus = null;
        boolean z6 = true;
        while (z6) {
            int s10 = b10.s(serialDescriptor);
            if (s10 != -1) {
                if (s10 != 0) {
                    if (s10 != 1) {
                        if (s10 != 2) {
                            if (s10 != 3) {
                                if (s10 == 4) {
                                    reviewPromptStatus = (BrowserExtensionConfig.ReviewPromptStatus) b10.b0(serialDescriptor, 4, (KSerializer) hVarArr[4].getValue(), reviewPromptStatus);
                                    i10 |= 16;
                                } else {
                                    ha.a.e(s10);
                                    return null;
                                }
                            } else {
                                bool4 = (Boolean) b10.b0(serialDescriptor, 3, g.f34583a, bool4);
                                i10 |= 8;
                            }
                        } else {
                            bool3 = (Boolean) b10.b0(serialDescriptor, 2, g.f34583a, bool3);
                            i10 |= 4;
                        }
                    } else {
                        bool2 = (Boolean) b10.b0(serialDescriptor, 1, g.f34583a, bool2);
                        i10 |= 2;
                    }
                } else {
                    bool = (Boolean) b10.b0(serialDescriptor, 0, g.f34583a, bool);
                    i10 |= 1;
                }
            } else {
                z6 = false;
            }
        }
        b10.c(serialDescriptor);
        return new BrowserExtensionConfig(i10, bool, bool2, bool3, bool4, reviewPromptStatus, (ur.c1) null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, BrowserExtensionConfig value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        b b10 = encoder.b(serialDescriptor);
        BrowserExtensionConfig.write$Self$data_release(value, b10, serialDescriptor);
        b10.c(serialDescriptor);
    }

    @Override // ur.a0
    public /* bridge */ KSerializer[] typeParametersSerializers() {
        return t0.f34657b;
    }
}
