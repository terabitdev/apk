package io.elevenlabs.data.api.adapter;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.parser.TokenNames;
import com.google.protobuf.c6;
import fs.n0;
import io.elevenlabs.data.model.ApiResult;
import io.elevenlabs.domain.Logger;
import java.io.IOException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import qr.h;
import zs.c;
import zs.f;
import zs.p0;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ#\u0010\u000e\u001a\u00020\r2\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0018\u0010\u0012J\u001b\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u0014\u0010%\u001a\u00020$8\u0002X\u0082D¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lio/elevenlabs/data/api/adapter/ResultCall;", TokenNames.T, "Lzs/c;", "Lio/elevenlabs/data/model/ApiResult;", "delegate", "Lvr/c;", "json", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lzs/c;Lvr/c;Lio/elevenlabs/domain/Logger;)V", "Lzs/f;", "callback", "Lsn/z;", "enqueue", "(Lzs/f;)V", "", "isExecuted", "()Z", "Lzs/p0;", "execute", "()Lzs/p0;", "cancel", "()V", "isCanceled", "clone", "()Lzs/c;", "Lokhttp3/Request;", "request", "()Lokhttp3/Request;", "Lfs/n0;", "timeout", "()Lfs/n0;", "Lzs/c;", "Lvr/c;", "Lio/elevenlabs/domain/Logger;", "", ParameterNames.TAG, "Ljava/lang/String;", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class ResultCall<T> implements c {
    private final c delegate;
    private final vr.c json;
    private final Logger logger;
    private final String tag;

    public ResultCall(c cVar, vr.c cVar2, Logger logger) {
        cVar.getClass();
        cVar2.getClass();
        logger.getClass();
        this.delegate = cVar;
        this.json = cVar2;
        this.logger = logger;
        this.tag = "ResultCall";
    }

    @Override // zs.c
    public void cancel() {
        this.delegate.cancel();
    }

    @Override // zs.c
    public c clone() {
        c clone = this.delegate.clone();
        clone.getClass();
        return new ResultCall(clone, this.json, this.logger);
    }

    @Override // zs.c
    public void enqueue(final f callback) {
        callback.getClass();
        this.delegate.enqueue(new f(this) { // from class: io.elevenlabs.data.api.adapter.ResultCall$enqueue$1
            final /* synthetic */ ResultCall<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // zs.f
            public void onFailure(c call, Throwable t10) {
                Logger logger;
                String str;
                ApiResult unknownError;
                Logger logger2;
                String str2;
                Logger logger3;
                String str3;
                call.getClass();
                t10.getClass();
                try {
                    if (t10 instanceof IOException) {
                        logger3 = ((ResultCall) this.this$0).logger;
                        str3 = ((ResultCall) this.this$0).tag;
                        logger3.log(str3, "Network error / " + t10.getMessage());
                        unknownError = new ApiResult.Error.NetworkError();
                    } else {
                        boolean z6 = t10 instanceof h;
                        ResultCall<T> resultCall = this.this$0;
                        if (z6) {
                            logger2 = ((ResultCall) resultCall).logger;
                            str2 = ((ResultCall) this.this$0).tag;
                            logger2.logWarning(str2, "Serialization error / " + t10.getMessage(), t10);
                            unknownError = new ApiResult.Error.NetworkError();
                        } else {
                            logger = ((ResultCall) resultCall).logger;
                            str = ((ResultCall) this.this$0).tag;
                            logger.logWarning(str, "Unknown API error", t10);
                            String localizedMessage = t10.getLocalizedMessage();
                            if (localizedMessage == null && (localizedMessage = t10.getMessage()) == null) {
                                localizedMessage = "";
                            }
                            unknownError = new ApiResult.Error.UnknownError(localizedMessage);
                        }
                    }
                    callback.onResponse(this.this$0, p0.a(unknownError));
                } catch (Throwable th) {
                    callback.onFailure(this.this$0, th);
                }
            }

            @Override // zs.f
            public void onResponse(c call, p0<T> response) {
                vr.c cVar;
                Logger logger;
                String str;
                Logger logger2;
                String str2;
                call.getClass();
                response.getClass();
                Response response2 = response.f39809a;
                if (response2.F0) {
                    logger2 = ((ResultCall) this.this$0).logger;
                    str2 = ((ResultCall) this.this$0).tag;
                    logger2.log(str2, "calling " + call.request().f25400b + Separators.SP + call.request().f25399a);
                    f fVar = callback;
                    c cVar2 = this.this$0;
                    int i10 = response2.f25426d;
                    Object obj = response.f39810b;
                    obj.getClass();
                    ApiResult.Success success = new ApiResult.Success(obj);
                    if (i10 >= 200 && i10 < 300) {
                        Response.Builder builder = new Response.Builder();
                        builder.f25434c = i10;
                        builder.f25435d = "Response.success()";
                        builder.f25433b = Protocol.HTTP_1_1;
                        Request.Builder builder2 = new Request.Builder();
                        builder2.f("http://localhost/");
                        builder.f25432a = new Request(builder2);
                        fVar.onResponse(cVar2, p0.b(success, builder.a()));
                        return;
                    }
                    c6.t(defpackage.f.e(i10, "code < 200 or >= 300: "));
                    return;
                }
                f fVar2 = callback;
                c cVar3 = this.this$0;
                Request request = call.request();
                request.getClass();
                cVar = ((ResultCall) this.this$0).json;
                logger = ((ResultCall) this.this$0).logger;
                str = ((ResultCall) this.this$0).tag;
                fVar2.onResponse(cVar3, p0.a(ResultCallAdapterFactoryKt.access$adaptResponseBody(request, response, cVar, logger, str)));
            }
        });
    }

    @Override // zs.c
    public p0<ApiResult<T>> execute() {
        Object obj = this.delegate.execute().f39810b;
        obj.getClass();
        return p0.a(new ApiResult.Success(obj));
    }

    @Override // zs.c
    public boolean isCanceled() {
        return this.delegate.isCanceled();
    }

    @Override // zs.c
    public boolean isExecuted() {
        return this.delegate.isExecuted();
    }

    @Override // zs.c
    public Request request() {
        Request request = this.delegate.request();
        request.getClass();
        return request;
    }

    @Override // zs.c
    public n0 timeout() {
        n0 timeout = this.delegate.timeout();
        timeout.getClass();
        return timeout;
    }
}
