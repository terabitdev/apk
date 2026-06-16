package io.elevenlabs.readerapp;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.firebase.messaging.Constants;
import com.google.protobuf.c6;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.readerapp.core.CrashlyticsLogger;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.jvm.internal.d0;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001:\u0001&B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJD\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u001c\u0010\u0014\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0096@¢\u0006\u0004\b\u0015\u0010\u0016JP\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00170\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00130\u0011H\u0096@¢\u0006\u0004\b\u0018\u0010\u0016J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ)\u0010\u001e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ)\u0010 \u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b \u0010\u001fJ#\u0010#\u001a\u00020\n2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00130!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010%¨\u0006'"}, d2 = {"Lio/elevenlabs/readerapp/LoggerImpl;", "Lio/elevenlabs/domain/Logger;", "Lio/elevenlabs/readerapp/core/CrashlyticsLogger;", "crashlyticsLogger", "<init>", "(Lio/elevenlabs/readerapp/core/CrashlyticsLogger;)V", "", ParameterNames.TAG, "Lkotlin/Function0;", "message", "Lsn/z;", "verbose", "(Ljava/lang/String;Lho/a;)V", "log", "(Ljava/lang/String;Ljava/lang/String;)V", TokenNames.T, DiagnosticsEntry.NAME_KEY, "Lkotlin/Function1;", "Lwn/c;", "", "transaction", "logTransaction", "(Ljava/lang/String;Ljava/lang/String;Lho/l;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/model/AsyncCallResult;", "logAsyncCallTransaction", "Lio/elevenlabs/domain/Logger$Transaction;", "startTransaction", "(Ljava/lang/String;Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "", ParameterNames.CAUSE, "logError", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "logWarning", "", "extras", "setExtras", "(Ljava/util/Map;)V", "Lio/elevenlabs/readerapp/core/CrashlyticsLogger;", "CrashlyticsTransaction", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class LoggerImpl implements Logger {
    public static final int $stable = 0;
    private final CrashlyticsLogger crashlyticsLogger;

    public LoggerImpl(CrashlyticsLogger crashlyticsLogger) {
        crashlyticsLogger.getClass();
        this.crashlyticsLogger = crashlyticsLogger;
    }

    @Override // io.elevenlabs.domain.Logger
    public void log(String tag, String message) {
        tag.getClass();
        message.getClass();
        this.crashlyticsLogger.log(tag, message);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00a8 A[Catch: all -> 0x0043, CancellationException -> 0x0047, TryCatch #5 {CancellationException -> 0x0047, all -> 0x0043, blocks: (B:12:0x003f, B:13:0x0099, B:15:0x00a8, B:16:0x00ea, B:20:0x00c6, B:22:0x00ca, B:23:0x0101, B:24:0x0106), top: B:11:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00c6 A[Catch: all -> 0x0043, CancellationException -> 0x0047, TryCatch #5 {CancellationException -> 0x0047, all -> 0x0043, blocks: (B:12:0x003f, B:13:0x0099, B:15:0x00a8, B:16:0x00ea, B:20:0x00c6, B:22:0x00ca, B:23:0x0101, B:24:0x0106), top: B:11:0x003f }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v14 */
    /* JADX WARN: Type inference failed for: r0v15 */
    /* JADX WARN: Type inference failed for: r0v2, types: [io.elevenlabs.readerapp.LoggerImpl$logAsyncCallTransaction$1, java.lang.Object, java.lang.String] */
    @Override // io.elevenlabs.domain.Logger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object logAsyncCallTransaction(String str, String str2, ho.l lVar, wn.c<? super AsyncCallResult<T>> cVar) {
        ?? r02;
        int i10;
        String str3;
        Throwable th;
        CancellationException e10;
        String str4;
        long j4;
        d0 d0Var;
        d0 d0Var2;
        AsyncCallResult asyncCallResult;
        try {
            if (cVar instanceof LoggerImpl$logAsyncCallTransaction$1) {
                LoggerImpl$logAsyncCallTransaction$1 loggerImpl$logAsyncCallTransaction$1 = (LoggerImpl$logAsyncCallTransaction$1) cVar;
                int i11 = loggerImpl$logAsyncCallTransaction$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    loggerImpl$logAsyncCallTransaction$1.label = i11 - Integer.MIN_VALUE;
                    r02 = loggerImpl$logAsyncCallTransaction$1;
                    Object obj = r02.result;
                    i10 = r02.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            j4 = r02.J$0;
                            d0Var = (d0) r02.L$5;
                            d0 d0Var3 = (d0) r02.L$3;
                            str4 = (String) r02.L$1;
                            str3 = (String) r02.L$0;
                            try {
                                sn.a.g(obj);
                                d0Var2 = d0Var3;
                            } catch (CancellationException e11) {
                                e10 = e11;
                                str2 = str4;
                                log(str3, "Transaction " + str2 + " completed: Cancelled");
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = str4;
                                log(str3, "Transaction " + str2 + " completed: Unknown Error");
                                throw th;
                            }
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        log(str, "Transaction " + str2 + " started");
                        try {
                            Object obj2 = new Object();
                            long a10 = xq.j.a();
                            r02.L$0 = str;
                            r02.L$1 = str2;
                            r02.L$2 = null;
                            r02.L$3 = obj2;
                            r02.L$4 = null;
                            r02.L$5 = obj2;
                            r02.I$0 = 0;
                            r02.I$1 = 0;
                            r02.J$0 = a10;
                            r02.I$2 = 0;
                            r02.label = 1;
                            Object invoke = lVar.invoke(r02);
                            xn.a aVar = xn.a.f37986a;
                            if (invoke == aVar) {
                                return aVar;
                            }
                            str3 = str;
                            str4 = str2;
                            Object obj3 = obj2;
                            j4 = a10;
                            obj = invoke;
                            d0Var = obj3;
                            d0Var2 = obj3;
                        } catch (CancellationException e12) {
                            str3 = str;
                            e10 = e12;
                            log(str3, "Transaction " + str2 + " completed: Cancelled");
                            throw e10;
                        } catch (Throwable th3) {
                            str3 = str;
                            th = th3;
                            log(str3, "Transaction " + str2 + " completed: Unknown Error");
                            throw th;
                        }
                    }
                    d0Var.f20559a = obj;
                    long a11 = xq.k.a(j4);
                    Object obj4 = d0Var2.f20559a;
                    asyncCallResult = (AsyncCallResult) obj4;
                    if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
                        log(str3, "Transaction " + str4 + " completed: Error / " + ((AsyncCallResult.Error) obj4).getError());
                    } else if (asyncCallResult instanceof AsyncCallResult.Success) {
                        log(str3, "Transaction " + str4 + " completed: OK (took " + xq.b.j(a11) + Separators.RPAREN);
                    } else {
                        throw new RuntimeException();
                    }
                    AsyncCallResult asyncCallResult2 = (AsyncCallResult) d0Var2.f20559a;
                    log(str3, "Transaction " + str4 + " ended");
                    return asyncCallResult2;
                }
            }
            if (i10 == 0) {
            }
            d0Var.f20559a = obj;
            long a112 = xq.k.a(j4);
            Object obj42 = d0Var2.f20559a;
            asyncCallResult = (AsyncCallResult) obj42;
            if (!(asyncCallResult instanceof AsyncCallResult.Error)) {
            }
            AsyncCallResult asyncCallResult22 = (AsyncCallResult) d0Var2.f20559a;
            log(str3, "Transaction " + str4 + " ended");
            return asyncCallResult22;
        } catch (Throwable th4) {
            log(r02, "Transaction " + str2 + " ended");
            throw th4;
        }
        r02 = new LoggerImpl$logAsyncCallTransaction$1(this, cVar);
        Object obj5 = r02.result;
        i10 = r02.label;
    }

    @Override // io.elevenlabs.domain.Logger
    public void logError(String tag, String message, Throwable cause) {
        tag.getClass();
        message.getClass();
        this.crashlyticsLogger.logError(tag, message, cause);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v2, types: [io.elevenlabs.readerapp.LoggerImpl$logTransaction$1, java.lang.Object, java.lang.String] */
    @Override // io.elevenlabs.domain.Logger
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <T> Object logTransaction(String str, String str2, ho.l lVar, wn.c<? super T> cVar) {
        ?? r02;
        int i10;
        String str3;
        Throwable th;
        CancellationException e10;
        String str4;
        long j4;
        d0 d0Var;
        d0 d0Var2;
        try {
            if (cVar instanceof LoggerImpl$logTransaction$1) {
                LoggerImpl$logTransaction$1 loggerImpl$logTransaction$1 = (LoggerImpl$logTransaction$1) cVar;
                int i11 = loggerImpl$logTransaction$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    loggerImpl$logTransaction$1.label = i11 - Integer.MIN_VALUE;
                    r02 = loggerImpl$logTransaction$1;
                    Object obj = r02.result;
                    i10 = r02.label;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            j4 = r02.J$0;
                            d0Var = (d0) r02.L$5;
                            d0 d0Var3 = (d0) r02.L$3;
                            str4 = (String) r02.L$1;
                            str3 = (String) r02.L$0;
                            try {
                                sn.a.g(obj);
                                d0Var2 = d0Var3;
                            } catch (CancellationException e11) {
                                e10 = e11;
                                str2 = str4;
                                log(str3, "Transaction " + str2 + " completed: Cancelled");
                                throw e10;
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = str4;
                                log(str3, "Transaction " + str2 + " completed: Error");
                                throw th;
                            }
                        } else {
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                    } else {
                        sn.a.g(obj);
                        log(str, "Transaction " + str2 + " started");
                        try {
                            Object obj2 = new Object();
                            long a10 = xq.j.a();
                            r02.L$0 = str;
                            r02.L$1 = str2;
                            r02.L$2 = null;
                            r02.L$3 = obj2;
                            r02.L$4 = null;
                            r02.L$5 = obj2;
                            r02.I$0 = 0;
                            r02.I$1 = 0;
                            r02.J$0 = a10;
                            r02.I$2 = 0;
                            r02.label = 1;
                            Object invoke = lVar.invoke(r02);
                            xn.a aVar = xn.a.f37986a;
                            if (invoke == aVar) {
                                return aVar;
                            }
                            str3 = str;
                            str4 = str2;
                            Object obj3 = obj2;
                            j4 = a10;
                            obj = invoke;
                            d0Var = obj3;
                            d0Var2 = obj3;
                        } catch (CancellationException e12) {
                            str3 = str;
                            e10 = e12;
                            log(str3, "Transaction " + str2 + " completed: Cancelled");
                            throw e10;
                        } catch (Throwable th3) {
                            str3 = str;
                            th = th3;
                            log(str3, "Transaction " + str2 + " completed: Error");
                            throw th;
                        }
                    }
                    d0Var.f20559a = obj;
                    log(str3, "Transaction " + str4 + " completed: OK (took " + xq.b.j(xq.k.a(j4)) + Separators.RPAREN);
                    Object obj4 = d0Var2.f20559a;
                    log(str3, "Transaction " + str4 + " ended");
                    return obj4;
                }
            }
            if (i10 == 0) {
            }
            d0Var.f20559a = obj;
            log(str3, "Transaction " + str4 + " completed: OK (took " + xq.b.j(xq.k.a(j4)) + Separators.RPAREN);
            Object obj42 = d0Var2.f20559a;
            log(str3, "Transaction " + str4 + " ended");
            return obj42;
        } catch (Throwable th4) {
            log(r02, "Transaction " + str2 + " ended");
            throw th4;
        }
        r02 = new LoggerImpl$logTransaction$1(this, cVar);
        Object obj5 = r02.result;
        i10 = r02.label;
    }

    @Override // io.elevenlabs.domain.Logger
    public void logWarning(String tag, String message, Throwable cause) {
        tag.getClass();
        message.getClass();
        this.crashlyticsLogger.log(tag, message);
    }

    @Override // io.elevenlabs.domain.Logger
    public void setExtras(Map<String, ? extends Object> extras) {
        extras.getClass();
        this.crashlyticsLogger.setCustomKeys(extras);
    }

    @Override // io.elevenlabs.domain.Logger
    public Object startTransaction(String str, String str2, wn.c<? super Logger.Transaction> cVar) {
        log(str, "Transaction " + str2 + " started");
        return new CrashlyticsTransaction(this.crashlyticsLogger, str, str2, 0L, 8, null);
    }

    @Override // io.elevenlabs.domain.Logger
    public void verbose(String tag, ho.a message) {
        tag.getClass();
        message.getClass();
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0016R\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0016R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0017R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lio/elevenlabs/readerapp/LoggerImpl$CrashlyticsTransaction;", "Lio/elevenlabs/domain/Logger$Transaction;", "Lio/elevenlabs/readerapp/core/CrashlyticsLogger;", "crashlyticsLogger", "", ParameterNames.TAG, DiagnosticsEntry.NAME_KEY, "", "startTime", "<init>", "(Lio/elevenlabs/readerapp/core/CrashlyticsLogger;Ljava/lang/String;Ljava/lang/String;J)V", "Lsn/z;", "ok", "()V", "", "t", Constants.IPC_BUNDLE_KEY_SEND_ERROR, "(Ljava/lang/Throwable;)V", "childName", "startChild", "(Ljava/lang/String;)Lio/elevenlabs/domain/Logger$Transaction;", "Lio/elevenlabs/readerapp/core/CrashlyticsLogger;", "Ljava/lang/String;", "J", "", "finished", "Z", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes3.dex */
    public static final class CrashlyticsTransaction implements Logger.Transaction {
        private final CrashlyticsLogger crashlyticsLogger;
        private boolean finished;
        private final String name;
        private final long startTime;
        private final String tag;

        public CrashlyticsTransaction(CrashlyticsLogger crashlyticsLogger, String str, String str2, long j4) {
            crashlyticsLogger.getClass();
            str.getClass();
            str2.getClass();
            this.crashlyticsLogger = crashlyticsLogger;
            this.tag = str;
            this.name = str2;
            this.startTime = j4;
        }

        @Override // io.elevenlabs.domain.Logger.Transaction
        public void error(Throwable t10) {
            t10.getClass();
            if (this.finished) {
                return;
            }
            this.finished = true;
            long currentTimeMillis = System.currentTimeMillis() - this.startTime;
            CrashlyticsLogger crashlyticsLogger = this.crashlyticsLogger;
            String str = this.tag;
            String str2 = this.name;
            String message = t10.getMessage();
            StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("Transaction ", str2, currentTimeMillis, " completed: Error (");
            r10.append("ms) - ");
            r10.append(message);
            crashlyticsLogger.log(str, r10.toString());
        }

        @Override // io.elevenlabs.domain.Logger.Transaction
        public void ok() {
            if (this.finished) {
                return;
            }
            this.finished = true;
            long currentTimeMillis = System.currentTimeMillis() - this.startTime;
            CrashlyticsLogger crashlyticsLogger = this.crashlyticsLogger;
            String str = this.tag;
            StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("Transaction ", this.name, currentTimeMillis, " completed: OK (");
            r10.append("ms)");
            crashlyticsLogger.log(str, r10.toString());
        }

        @Override // io.elevenlabs.domain.Logger.Transaction
        public Logger.Transaction startChild(String childName) {
            childName.getClass();
            this.crashlyticsLogger.log(this.tag, defpackage.f.k("Transaction ", this.name, " -> starting child: ", childName));
            return new CrashlyticsTransaction(this.crashlyticsLogger, this.tag, defpackage.f.j(this.name, "->", childName), 0L, 8, null);
        }

        public /* synthetic */ CrashlyticsTransaction(CrashlyticsLogger crashlyticsLogger, String str, String str2, long j4, int i10, kotlin.jvm.internal.f fVar) {
            this(crashlyticsLogger, str, str2, (i10 & 8) != 0 ? System.currentTimeMillis() : j4);
        }
    }
}
