package io.elevenlabs.data.model.response;

import android.gov.nist.core.Separators;
import defpackage.f;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import vr.g;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final /* synthetic */ class ReadDetailsSection$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0 implements g {
    private final /* synthetic */ String discriminator;

    public ReadDetailsSection$Companion$annotationImpl$kotlinx_serialization_json_JsonClassDiscriminator$0(String str) {
        str.getClass();
        this.discriminator = str;
    }

    @Override // java.lang.annotation.Annotation
    public final /* synthetic */ Class annotationType() {
        return g.class;
    }

    @Override // vr.g
    public final /* synthetic */ String discriminator() {
        return this.discriminator;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (!(obj instanceof g) || !m.c(discriminator(), ((g) obj).discriminator())) {
            return false;
        }
        return true;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return this.discriminator.hashCode() ^ 707790692;
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return f.C("@kotlinx.serialization.json.JsonClassDiscriminator(discriminator=", this.discriminator, Separators.RPAREN);
    }
}
