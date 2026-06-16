package io.elevenlabs.domain;

import android.gov.nist.javax.sip.header.ParameterNames;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.f;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0006\b\u0016\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u00020\u0003X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Lio/elevenlabs/domain/ApiException;", "Ljava/io/IOException;", "code", "", "message", ParameterNames.CAUSE, "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "getCode", "()Ljava/lang/String;", "getMessage", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public class ApiException extends IOException {
    private final String code;
    private final String message;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApiException(String str, String str2, Throwable th) {
        super(str2, th);
        str.getClass();
        str2.getClass();
        this.code = str;
        this.message = str2;
    }

    public final String getCode() {
        return this.code;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }

    public /* synthetic */ ApiException(String str, String str2, Throwable th, int i10, f fVar) {
        this(str, str2, (i10 & 4) != 0 ? null : th);
    }
}
