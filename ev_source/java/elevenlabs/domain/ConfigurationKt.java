package io.elevenlabs.domain;

import android.gov.nist.core.Separators;
import ig.f;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0005\"\u0015\u0010\u0000\u001a\u00020\u0001*\u00020\u00028F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"httpUserAgent", "", "Lio/elevenlabs/domain/Configuration;", "getHttpUserAgent", "(Lio/elevenlabs/domain/Configuration;)Ljava/lang/String;", "supportedMimeTypes", "", "getSupportedMimeTypes", "()Ljava/util/List;", "supportedImageMimeTypes", "getSupportedImageMimeTypes", "domain"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ConfigurationKt {
    private static final List<String> supportedMimeTypes = f.I("application/pdf", "application/vnd.openxmlformats-officedocument.wordprocessingml.document", "application/epub+zip", "text/plain", "text/markdown", "text/x-markdown", "text/html");
    private static final List<String> supportedImageMimeTypes = f.I("image/png", "image/jpeg", "image/bmp");

    public static final String getHttpUserAgent(Configuration configuration) {
        configuration.getClass();
        return defpackage.f.f(configuration.getAppVersionCode(), Separators.RPAREN, defpackage.f.s("okhttp ", configuration.getPackageName(), Separators.SLASH, configuration.getAppVersionName(), " ("));
    }

    public static final List<String> getSupportedImageMimeTypes() {
        return supportedImageMimeTypes;
    }

    public static final List<String> getSupportedMimeTypes() {
        return supportedMimeTypes;
    }
}
