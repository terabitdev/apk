package io.elevenlabs.readerapp.usecase;

import android.app.Activity;
import android.content.Context;
import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.tasks.Task;
import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.services.AppRatingService;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;
import zg.e;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0086B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0010R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lio/elevenlabs/readerapp/usecase/RateAppUseCase;", "", "Landroid/content/Context;", "context", "Lio/elevenlabs/domain/services/AppRatingService;", "ratingService", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Landroid/content/Context;Lio/elevenlabs/domain/services/AppRatingService;Lio/elevenlabs/domain/Logger;)V", "Landroid/app/Activity;", "activity", "Lsn/z;", "invoke", "(Landroid/app/Activity;Lwn/c;)Ljava/lang/Object;", "Landroid/content/Context;", "Lio/elevenlabs/domain/services/AppRatingService;", "Lio/elevenlabs/domain/Logger;", "", ParameterNames.TAG, "Ljava/lang/String;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class RateAppUseCase {
    public static final int $stable = 8;
    private final Context context;
    private final Logger logger;
    private final AppRatingService ratingService;
    private final String tag;

    public RateAppUseCase(Context context, AppRatingService appRatingService, Logger logger) {
        context.getClass();
        appRatingService.getClass();
        logger.getClass();
        this.context = context;
        this.ratingService = appRatingService;
        this.logger = logger;
        this.tag = "RateAppUseCase";
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00b2, code lost:
    
        if (kj.c.j(r9, r0) != r6) goto L34;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Activity activity, c<? super z> cVar) {
        RateAppUseCase$invoke$1 rateAppUseCase$invoke$1;
        int i10;
        z zVar;
        zg.c cVar2;
        try {
            if (cVar instanceof RateAppUseCase$invoke$1) {
                rateAppUseCase$invoke$1 = (RateAppUseCase$invoke$1) cVar;
                int i11 = rateAppUseCase$invoke$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    rateAppUseCase$invoke$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = rateAppUseCase$invoke$1.result;
                    i10 = rateAppUseCase$invoke$1.label;
                    zVar = z.f31622a;
                    xn.a aVar = xn.a.f37986a;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                sn.a.g(obj);
                                this.ratingService.onAppRated();
                                return zVar;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        activity = (Activity) rateAppUseCase$invoke$1.L$4;
                        cVar2 = (zg.c) rateAppUseCase$invoke$1.L$3;
                        sn.a.g(obj);
                    } else {
                        sn.a.g(obj);
                        if (!this.ratingService.canRateApp()) {
                            return zVar;
                        }
                        Context context = this.context;
                        Context applicationContext = context.getApplicationContext();
                        if (applicationContext != null) {
                            context = applicationContext;
                        }
                        cVar2 = new zg.c(new e(context));
                        Task b10 = cVar2.b();
                        b10.getClass();
                        rateAppUseCase$invoke$1.L$0 = null;
                        rateAppUseCase$invoke$1.L$1 = null;
                        rateAppUseCase$invoke$1.L$2 = null;
                        rateAppUseCase$invoke$1.L$3 = cVar2;
                        rateAppUseCase$invoke$1.L$4 = activity;
                        rateAppUseCase$invoke$1.label = 1;
                        obj = kj.c.j(b10, rateAppUseCase$invoke$1);
                        if (obj == aVar) {
                            return aVar;
                        }
                    }
                    Task a10 = cVar2.a(activity, (zg.a) obj);
                    a10.getClass();
                    rateAppUseCase$invoke$1.L$0 = null;
                    rateAppUseCase$invoke$1.L$1 = null;
                    rateAppUseCase$invoke$1.L$2 = null;
                    rateAppUseCase$invoke$1.L$3 = null;
                    rateAppUseCase$invoke$1.L$4 = null;
                    rateAppUseCase$invoke$1.label = 2;
                }
            }
            if (i10 == 0) {
            }
            Task a102 = cVar2.a(activity, (zg.a) obj);
            a102.getClass();
            rateAppUseCase$invoke$1.L$0 = null;
            rateAppUseCase$invoke$1.L$1 = null;
            rateAppUseCase$invoke$1.L$2 = null;
            rateAppUseCase$invoke$1.L$3 = null;
            rateAppUseCase$invoke$1.L$4 = null;
            rateAppUseCase$invoke$1.label = 2;
        } catch (Exception e10) {
            this.logger.logWarning(this.tag, "Can't rate app", e10);
            return zVar;
        }
        rateAppUseCase$invoke$1 = new RateAppUseCase$invoke$1(this, cVar);
        Object obj2 = rateAppUseCase$invoke$1.result;
        i10 = rateAppUseCase$invoke$1.label;
        zVar = z.f31622a;
        xn.a aVar2 = xn.a.f37986a;
    }
}
