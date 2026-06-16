package io.elevenlabs.domain;

import a9.a;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.messaging.Constants;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import ho.l;
import io.elevenlabs.domain.model.AsyncCallResult;
import java.util.Map;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001:\u0001 J%\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\t\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\t\u0010\nJD\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\u001c\u0010\u000f\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH¦@¢\u0006\u0004\b\u0010\u0010\u0011JP\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012\"\u0004\b\u0000\u0010\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u00022\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00120\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u00010\rH¦@¢\u0006\u0004\b\u0013\u0010\u0011J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0002H¦@¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0019\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u0019\u0010\u001aJ+\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017H&¢\u0006\u0004\b\u001b\u0010\u001aJ#\u0010\u001e\u001a\u00020\u00062\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00010\u001cH&¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006!À\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/Logger;", "", "", ParameterNames.TAG, "Lkotlin/Function0;", "message", "Lsn/z;", "verbose", "(Ljava/lang/String;Lho/a;)V", "log", "(Ljava/lang/String;Ljava/lang/String;)V", TokenNames.T, DiagnosticsEntry.NAME_KEY, "Lkotlin/Function1;", "Lwn/c;", "transaction", "logTransaction", "(Ljava/lang/String;Ljava/lang/String;Lho/l;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "logAsyncCallTransaction", "Lio/elevenlabs/domain/Logger$Transaction;", "startTransaction", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", ParameterNames.CAUSE, "logError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "logWarning", "", "extras", "setExtras", "(Ljava/util/Map;)V", "Transaction", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public interface Logger {

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class DefaultImpls {
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lio/elevenlabs/domain/Logger$Transaction;", "", "Lsn/z;", "ok", "()V", "", "t", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "(Ljava/lang/Throwable;)V", "", DiagnosticsEntry.NAME_KEY, "startChild", "(Ljava/lang/String;)Lio/elevenlabs/domain/Logger$Transaction;", "domain"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public interface Transaction {
        void error(Throwable th);

        void ok();

        Transaction startChild(String r12);
    }

    static /* synthetic */ void logWarning$default(Logger logger, String str, String str2, Throwable th, int i10, Object obj) {
        if (obj == null) {
            if ((i10 & 4) != 0) {
                th = null;
            }
            logger.logWarning(str, str2, th);
            return;
        }
        a.y("Super calls with default arguments not supported in this target, function: logWarning");
    }

    void log(String r12, String message);

    <T> Object logAsyncCallTransaction(String str, String str2, l lVar, c<? super AsyncCallResult<T>> cVar);

    void logError(String r12, String message, Throwable r32);

    <T> Object logTransaction(String str, String str2, l lVar, c<? super T> cVar);

    void logWarning(String r12, String message, Throwable r32);

    void setExtras(Map<String, ? extends Object> extras);

    Object startTransaction(String str, String str2, c<? super Transaction> cVar);

    void verbose(String r12, ho.a message);
}
