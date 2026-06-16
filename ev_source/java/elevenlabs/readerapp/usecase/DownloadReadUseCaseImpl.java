package io.elevenlabs.readerapp.usecase;

import com.google.protobuf.c6;
import defpackage.f;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.domain.model.Destination;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.services.DownloadReadResult;
import io.elevenlabs.domain.services.NavigationService;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.domain.services.ProductsService;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.services.ToastService;
import io.elevenlabs.domain.services.VoicesService;
import io.elevenlabs.domain.usecase.DownloadReadUseCase;
import io.elevenlabs.readerapp.R;
import ir.i;
import ir.r;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import livekit.LivekitInternal$NodeStats;
import sn.z;
import wn.c;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001.BA\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ \u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0096B¢\u0006\u0004\b\u001e\u0010\u001fJ\"\u0010\"\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010!\u001a\u00020 H\u0096@¢\u0006\u0004\b\"\u0010#J\u0018\u0010%\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b%\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010+R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010,R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010-¨\u0006/"}, d2 = {"Lio/elevenlabs/readerapp/usecase/DownloadReadUseCaseImpl;", "Lio/elevenlabs/domain/usecase/DownloadReadUseCase;", "Lio/elevenlabs/domain/services/OfflineReadsService;", "offlineReadsService", "Lio/elevenlabs/domain/services/ReadsService;", "readsService", "Lio/elevenlabs/domain/services/VoicesService;", "voicesService", "Lio/elevenlabs/domain/services/NavigationService;", "navigationService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/services/OfflineReadsService;Lio/elevenlabs/domain/services/ReadsService;Lio/elevenlabs/domain/services/VoicesService;Lio/elevenlabs/domain/services/NavigationService;Lio/elevenlabs/domain/services/ToastService;Lio/elevenlabs/domain/StringProvider;Lio/elevenlabs/domain/Logger;)V", "", "readId", "resolveVoiceId", "(Ljava/lang/String;Lwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/services/DownloadReadResult;", "result", "successTitle", "Lsn/z;", "handleResult", "(Lio/elevenlabs/domain/services/DownloadReadResult;Ljava/lang/String;)V", "", "readTotalCharCount", "invoke", "(Ljava/lang/String;JLwn/c;)Ljava/lang/Object;", "", "chapterIndex", "invokeForChapter", "(Ljava/lang/String;ILwn/c;)Ljava/lang/Object;", "offlineReadId", "invokeRetry", "(JLwn/c;)Ljava/lang/Object;", "Lio/elevenlabs/domain/services/OfflineReadsService;", "Lio/elevenlabs/domain/services/ReadsService;", "Lio/elevenlabs/domain/services/VoicesService;", "Lio/elevenlabs/domain/services/NavigationService;", "Lio/elevenlabs/domain/services/ToastService;", "Lio/elevenlabs/domain/StringProvider;", "Lio/elevenlabs/domain/Logger;", "Companion", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class DownloadReadUseCaseImpl implements DownloadReadUseCase {
    private static final String TAG = "DownloadReadUseCase";
    private final Logger logger;
    private final NavigationService navigationService;
    private final OfflineReadsService offlineReadsService;
    private final ReadsService readsService;
    private final StringProvider stringProvider;
    private final ToastService toastService;
    private final VoicesService voicesService;
    public static final int $stable = 8;

    public DownloadReadUseCaseImpl(OfflineReadsService offlineReadsService, ReadsService readsService, VoicesService voicesService, NavigationService navigationService, ToastService toastService, StringProvider stringProvider, Logger logger) {
        offlineReadsService.getClass();
        readsService.getClass();
        voicesService.getClass();
        navigationService.getClass();
        toastService.getClass();
        stringProvider.getClass();
        logger.getClass();
        this.offlineReadsService = offlineReadsService;
        this.readsService = readsService;
        this.voicesService = voicesService;
        this.navigationService = navigationService;
        this.toastService = toastService;
        this.stringProvider = stringProvider;
        this.logger = logger;
    }

    private final void handleResult(DownloadReadResult result, String successTitle) {
        if (m.c(result, DownloadReadResult.InitiatedSuccessfully.INSTANCE)) {
            ToastService toastService = this.toastService;
            if (successTitle == null) {
                successTitle = this.stringProvider.getString(R.string.offline_download_started_toast_title);
            }
            toastService.showToast(new ToastService.Toast.Action(successTitle, this.stringProvider.getString(R.string.offline_download_started_toast_message), null, 4, null));
            return;
        }
        if (result instanceof DownloadReadResult.Error.OfflineConversionLimitReached) {
            this.navigationService.navigate(new Destination.Authorized.OfflineDownloadLimitReached(((DownloadReadResult.Error.OfflineConversionLimitReached) result).getMessage()));
            return;
        }
        if (result instanceof DownloadReadResult.Error.InsufficientOfflineDownloadCredits) {
            this.navigationService.navigate(new Destination.Authorized.OfflineDownloadLimitReached(((DownloadReadResult.Error.InsufficientOfflineDownloadCredits) result).getMessage()));
            return;
        }
        if (m.c(result, DownloadReadResult.Error.UserIsOnFreePlan.INSTANCE)) {
            this.navigationService.navigate(new Destination.Authorized.Paywall(ProductsService.PaywallSource.OFFLINE, Analytics.Event.PaywallSource.OfflineMode));
            return;
        }
        if (result instanceof DownloadReadResult.Error.ApiDisplayableMessageError) {
            ToastService.showToast$default(this.toastService, ((DownloadReadResult.Error.ApiDisplayableMessageError) result).getMessage(), null, ToastService.ToastVariant.ERROR, 2, null);
            return;
        }
        if (m.c(result, DownloadReadResult.Error.Network.INSTANCE)) {
            ToastService.showToast$default(this.toastService, this.stringProvider.getString(R.string.error_network_error), null, ToastService.ToastVariant.ERROR, 2, null);
        } else if (result instanceof DownloadReadResult.Error.Unhandled) {
            ToastService.showToast$default(this.toastService, this.stringProvider.getString(R.string.error_unknown_error), null, ToastService.ToastVariant.ERROR, 2, null);
        } else {
            c6.p();
        }
    }

    public static /* synthetic */ void handleResult$default(DownloadReadUseCaseImpl downloadReadUseCaseImpl, DownloadReadResult downloadReadResult, String str, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str = null;
        }
        downloadReadUseCaseImpl.handleResult(downloadReadResult, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x004f, code lost:
    
        if (r8 == r5) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0070 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0071 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object resolveVoiceId(String str, c<? super String> cVar) {
        DownloadReadUseCaseImpl$resolveVoiceId$1 downloadReadUseCaseImpl$resolveVoiceId$1;
        int i10;
        xn.a aVar;
        ReadMeta readMeta;
        Object u6;
        String lastUsedVoiceId;
        if (cVar instanceof DownloadReadUseCaseImpl$resolveVoiceId$1) {
            downloadReadUseCaseImpl$resolveVoiceId$1 = (DownloadReadUseCaseImpl$resolveVoiceId$1) cVar;
            int i11 = downloadReadUseCaseImpl$resolveVoiceId$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                downloadReadUseCaseImpl$resolveVoiceId$1.label = i11 - Integer.MIN_VALUE;
                Object obj = downloadReadUseCaseImpl$resolveVoiceId$1.result;
                i10 = downloadReadUseCaseImpl$resolveVoiceId$1.label;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            sn.a.g(obj);
                            return obj;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    ReadsService readsService = this.readsService;
                    downloadReadUseCaseImpl$resolveVoiceId$1.L$0 = null;
                    downloadReadUseCaseImpl$resolveVoiceId$1.label = 1;
                    obj = readsService.getRead(str, downloadReadUseCaseImpl$resolveVoiceId$1);
                }
                readMeta = (ReadMeta) obj;
                if (readMeta == null && (lastUsedVoiceId = readMeta.getLastUsedVoiceId()) != null) {
                    return lastUsedVoiceId;
                }
                i defaultVoiceId = this.voicesService.defaultVoiceId();
                downloadReadUseCaseImpl$resolveVoiceId$1.L$0 = null;
                downloadReadUseCaseImpl$resolveVoiceId$1.L$1 = null;
                downloadReadUseCaseImpl$resolveVoiceId$1.label = 2;
                u6 = r.u(defaultVoiceId, downloadReadUseCaseImpl$resolveVoiceId$1);
                if (u6 != aVar) {
                    return aVar;
                }
                return u6;
            }
        }
        downloadReadUseCaseImpl$resolveVoiceId$1 = new DownloadReadUseCaseImpl$resolveVoiceId$1(this, cVar);
        Object obj2 = downloadReadUseCaseImpl$resolveVoiceId$1.result;
        i10 = downloadReadUseCaseImpl$resolveVoiceId$1.label;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        readMeta = (ReadMeta) obj2;
        if (readMeta == null) {
        }
        i defaultVoiceId2 = this.voicesService.defaultVoiceId();
        downloadReadUseCaseImpl$resolveVoiceId$1.L$0 = null;
        downloadReadUseCaseImpl$resolveVoiceId$1.L$1 = null;
        downloadReadUseCaseImpl$resolveVoiceId$1.label = 2;
        u6 = r.u(defaultVoiceId2, downloadReadUseCaseImpl$resolveVoiceId$1);
        if (u6 != aVar) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r14 == r9) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // io.elevenlabs.domain.usecase.DownloadReadUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invoke(String str, long j4, c<? super z> cVar) {
        DownloadReadUseCaseImpl$invoke$1 downloadReadUseCaseImpl$invoke$1;
        Object obj;
        int i10;
        xn.a aVar;
        DownloadReadUseCaseImpl downloadReadUseCaseImpl;
        if (cVar instanceof DownloadReadUseCaseImpl$invoke$1) {
            downloadReadUseCaseImpl$invoke$1 = (DownloadReadUseCaseImpl$invoke$1) cVar;
            int i11 = downloadReadUseCaseImpl$invoke$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                downloadReadUseCaseImpl$invoke$1.label = i11 - Integer.MIN_VALUE;
                DownloadReadUseCaseImpl$invoke$1 downloadReadUseCaseImpl$invoke$12 = downloadReadUseCaseImpl$invoke$1;
                obj = downloadReadUseCaseImpl$invoke$12.result;
                i10 = downloadReadUseCaseImpl$invoke$12.label;
                aVar = xn.a.f37986a;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 == 2) {
                            downloadReadUseCaseImpl = (DownloadReadUseCaseImpl) downloadReadUseCaseImpl$invoke$12.L$2;
                            sn.a.g(obj);
                            handleResult$default(downloadReadUseCaseImpl, (DownloadReadResult) obj, null, 2, null);
                            return z.f31622a;
                        }
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j4 = downloadReadUseCaseImpl$invoke$12.J$0;
                    str = (String) downloadReadUseCaseImpl$invoke$12.L$0;
                    sn.a.g(obj);
                } else {
                    sn.a.g(obj);
                    downloadReadUseCaseImpl$invoke$12.L$0 = str;
                    downloadReadUseCaseImpl$invoke$12.J$0 = j4;
                    downloadReadUseCaseImpl$invoke$12.label = 1;
                    obj = resolveVoiceId(str, downloadReadUseCaseImpl$invoke$12);
                }
                String str2 = str;
                long j10 = j4;
                String str3 = (String) obj;
                this.logger.log(TAG, f.k("invoke - requesting download: readId=", str2, ", voiceId=", str3));
                OfflineReadsService offlineReadsService = this.offlineReadsService;
                downloadReadUseCaseImpl$invoke$12.L$0 = null;
                downloadReadUseCaseImpl$invoke$12.L$1 = null;
                downloadReadUseCaseImpl$invoke$12.L$2 = this;
                downloadReadUseCaseImpl$invoke$12.J$0 = j10;
                downloadReadUseCaseImpl$invoke$12.label = 2;
                obj = offlineReadsService.downloadAllChapters(str2, str3, j10, downloadReadUseCaseImpl$invoke$12);
                if (obj != aVar) {
                    downloadReadUseCaseImpl = this;
                    handleResult$default(downloadReadUseCaseImpl, (DownloadReadResult) obj, null, 2, null);
                    return z.f31622a;
                }
                return aVar;
            }
        }
        downloadReadUseCaseImpl$invoke$1 = new DownloadReadUseCaseImpl$invoke$1(this, cVar);
        DownloadReadUseCaseImpl$invoke$1 downloadReadUseCaseImpl$invoke$122 = downloadReadUseCaseImpl$invoke$1;
        obj = downloadReadUseCaseImpl$invoke$122.result;
        i10 = downloadReadUseCaseImpl$invoke$122.label;
        aVar = xn.a.f37986a;
        if (i10 == 0) {
        }
        String str22 = str;
        long j102 = j4;
        String str32 = (String) obj;
        this.logger.log(TAG, f.k("invoke - requesting download: readId=", str22, ", voiceId=", str32));
        OfflineReadsService offlineReadsService2 = this.offlineReadsService;
        downloadReadUseCaseImpl$invoke$122.L$0 = null;
        downloadReadUseCaseImpl$invoke$122.L$1 = null;
        downloadReadUseCaseImpl$invoke$122.L$2 = this;
        downloadReadUseCaseImpl$invoke$122.J$0 = j102;
        downloadReadUseCaseImpl$invoke$122.label = 2;
        obj = offlineReadsService2.downloadAllChapters(str22, str32, j102, downloadReadUseCaseImpl$invoke$122);
        if (obj != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00bb, code lost:
    
        if (r12 != r6) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0069, code lost:
    
        if (r12 == r6) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // io.elevenlabs.domain.usecase.DownloadReadUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invokeForChapter(String str, int i10, c<? super String> cVar) {
        DownloadReadUseCaseImpl$invokeForChapter$1 downloadReadUseCaseImpl$invokeForChapter$1;
        Object obj;
        int i11;
        xn.a aVar;
        ReadMeta readMeta;
        String str2;
        int i12;
        if (cVar instanceof DownloadReadUseCaseImpl$invokeForChapter$1) {
            downloadReadUseCaseImpl$invokeForChapter$1 = (DownloadReadUseCaseImpl$invokeForChapter$1) cVar;
            int i13 = downloadReadUseCaseImpl$invokeForChapter$1.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                downloadReadUseCaseImpl$invokeForChapter$1.label = i13 - Integer.MIN_VALUE;
                obj = downloadReadUseCaseImpl$invokeForChapter$1.result;
                i11 = downloadReadUseCaseImpl$invokeForChapter$1.label;
                aVar = xn.a.f37986a;
                if (i11 == 0) {
                    if (i11 != 1) {
                        if (i11 != 2) {
                            if (i11 == 3) {
                                sn.a.g(obj);
                                DownloadReadResult downloadReadResult = (DownloadReadResult) obj;
                                if (m.c(downloadReadResult, DownloadReadResult.InitiatedSuccessfully.INSTANCE)) {
                                    return null;
                                }
                                if (downloadReadResult instanceof DownloadReadResult.Error.OfflineConversionLimitReached) {
                                    this.navigationService.navigate(new Destination.Authorized.OfflineDownloadLimitReached(((DownloadReadResult.Error.OfflineConversionLimitReached) downloadReadResult).getMessage()));
                                    return null;
                                }
                                if (downloadReadResult instanceof DownloadReadResult.Error.InsufficientOfflineDownloadCredits) {
                                    this.navigationService.navigate(new Destination.Authorized.OfflineDownloadLimitReached(((DownloadReadResult.Error.InsufficientOfflineDownloadCredits) downloadReadResult).getMessage()));
                                    return null;
                                }
                                if (m.c(downloadReadResult, DownloadReadResult.Error.UserIsOnFreePlan.INSTANCE)) {
                                    this.navigationService.navigate(new Destination.Authorized.Paywall(ProductsService.PaywallSource.OFFLINE, Analytics.Event.PaywallSource.OfflineMode));
                                    return null;
                                }
                                if (downloadReadResult instanceof DownloadReadResult.Error.ApiDisplayableMessageError) {
                                    return ((DownloadReadResult.Error.ApiDisplayableMessageError) downloadReadResult).getMessage();
                                }
                                if (m.c(downloadReadResult, DownloadReadResult.Error.Network.INSTANCE)) {
                                    return this.stringProvider.getString(R.string.error_network_error);
                                }
                                if (downloadReadResult instanceof DownloadReadResult.Error.Unhandled) {
                                    return this.stringProvider.getString(R.string.error_unknown_error);
                                }
                                c6.p();
                                return null;
                            }
                            c6.x("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        i12 = downloadReadUseCaseImpl$invokeForChapter$1.I$0;
                        str2 = (String) downloadReadUseCaseImpl$invokeForChapter$1.L$0;
                        sn.a.g(obj);
                        String lastUsedVoiceId = (String) obj;
                        String str3 = str2;
                        i10 = i12;
                        str = str3;
                        Logger logger = this.logger;
                        StringBuilder o6 = android.gov.nist.javax.sip.header.a.o(i10, "invokeForChapter - readId=", str, ", chapter=", ", voiceId=");
                        o6.append(lastUsedVoiceId);
                        logger.log(TAG, o6.toString());
                        OfflineReadsService offlineReadsService = this.offlineReadsService;
                        downloadReadUseCaseImpl$invokeForChapter$1.L$0 = null;
                        downloadReadUseCaseImpl$invokeForChapter$1.L$1 = null;
                        downloadReadUseCaseImpl$invokeForChapter$1.L$2 = null;
                        downloadReadUseCaseImpl$invokeForChapter$1.I$0 = i10;
                        downloadReadUseCaseImpl$invokeForChapter$1.label = 3;
                        obj = offlineReadsService.downloadChapter(str, lastUsedVoiceId, i10, downloadReadUseCaseImpl$invokeForChapter$1);
                    } else {
                        i10 = downloadReadUseCaseImpl$invokeForChapter$1.I$0;
                        str = (String) downloadReadUseCaseImpl$invokeForChapter$1.L$0;
                        sn.a.g(obj);
                    }
                } else {
                    sn.a.g(obj);
                    ReadsService readsService = this.readsService;
                    downloadReadUseCaseImpl$invokeForChapter$1.L$0 = str;
                    downloadReadUseCaseImpl$invokeForChapter$1.I$0 = i10;
                    downloadReadUseCaseImpl$invokeForChapter$1.label = 1;
                    obj = readsService.getRead(str, downloadReadUseCaseImpl$invokeForChapter$1);
                }
                readMeta = (ReadMeta) obj;
                if (readMeta != null || (lastUsedVoiceId = readMeta.getLastUsedVoiceId()) == null) {
                    i defaultVoiceId = this.voicesService.defaultVoiceId();
                    downloadReadUseCaseImpl$invokeForChapter$1.L$0 = str;
                    downloadReadUseCaseImpl$invokeForChapter$1.L$1 = null;
                    downloadReadUseCaseImpl$invokeForChapter$1.I$0 = i10;
                    downloadReadUseCaseImpl$invokeForChapter$1.label = 2;
                    obj = r.u(defaultVoiceId, downloadReadUseCaseImpl$invokeForChapter$1);
                    if (obj != aVar) {
                        int i14 = i10;
                        str2 = str;
                        i12 = i14;
                        String lastUsedVoiceId2 = (String) obj;
                        String str32 = str2;
                        i10 = i12;
                        str = str32;
                    }
                    return aVar;
                }
                Logger logger2 = this.logger;
                StringBuilder o62 = android.gov.nist.javax.sip.header.a.o(i10, "invokeForChapter - readId=", str, ", chapter=", ", voiceId=");
                o62.append(lastUsedVoiceId2);
                logger2.log(TAG, o62.toString());
                OfflineReadsService offlineReadsService2 = this.offlineReadsService;
                downloadReadUseCaseImpl$invokeForChapter$1.L$0 = null;
                downloadReadUseCaseImpl$invokeForChapter$1.L$1 = null;
                downloadReadUseCaseImpl$invokeForChapter$1.L$2 = null;
                downloadReadUseCaseImpl$invokeForChapter$1.I$0 = i10;
                downloadReadUseCaseImpl$invokeForChapter$1.label = 3;
                obj = offlineReadsService2.downloadChapter(str, lastUsedVoiceId2, i10, downloadReadUseCaseImpl$invokeForChapter$1);
            }
        }
        downloadReadUseCaseImpl$invokeForChapter$1 = new DownloadReadUseCaseImpl$invokeForChapter$1(this, cVar);
        obj = downloadReadUseCaseImpl$invokeForChapter$1.result;
        i11 = downloadReadUseCaseImpl$invokeForChapter$1.label;
        aVar = xn.a.f37986a;
        if (i11 == 0) {
        }
        readMeta = (ReadMeta) obj;
        if (readMeta != null) {
        }
        i defaultVoiceId2 = this.voicesService.defaultVoiceId();
        downloadReadUseCaseImpl$invokeForChapter$1.L$0 = str;
        downloadReadUseCaseImpl$invokeForChapter$1.L$1 = null;
        downloadReadUseCaseImpl$invokeForChapter$1.I$0 = i10;
        downloadReadUseCaseImpl$invokeForChapter$1.label = 2;
        obj = r.u(defaultVoiceId2, downloadReadUseCaseImpl$invokeForChapter$1);
        if (obj != aVar) {
        }
        return aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    @Override // io.elevenlabs.domain.usecase.DownloadReadUseCase
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object invokeRetry(long j4, c<? super z> cVar) {
        DownloadReadUseCaseImpl$invokeRetry$1 downloadReadUseCaseImpl$invokeRetry$1;
        int i10;
        DownloadReadUseCaseImpl downloadReadUseCaseImpl;
        if (cVar instanceof DownloadReadUseCaseImpl$invokeRetry$1) {
            downloadReadUseCaseImpl$invokeRetry$1 = (DownloadReadUseCaseImpl$invokeRetry$1) cVar;
            int i11 = downloadReadUseCaseImpl$invokeRetry$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                downloadReadUseCaseImpl$invokeRetry$1.label = i11 - Integer.MIN_VALUE;
                Object obj = downloadReadUseCaseImpl$invokeRetry$1.result;
                i10 = downloadReadUseCaseImpl$invokeRetry$1.label;
                if (i10 == 0) {
                    if (i10 == 1) {
                        downloadReadUseCaseImpl = (DownloadReadUseCaseImpl) downloadReadUseCaseImpl$invokeRetry$1.L$0;
                        sn.a.g(obj);
                    } else {
                        c6.x("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    sn.a.g(obj);
                    this.logger.log(TAG, "invokeRetry - offlineReadId=" + j4);
                    OfflineReadsService offlineReadsService = this.offlineReadsService;
                    downloadReadUseCaseImpl$invokeRetry$1.L$0 = this;
                    downloadReadUseCaseImpl$invokeRetry$1.J$0 = j4;
                    downloadReadUseCaseImpl$invokeRetry$1.label = 1;
                    obj = offlineReadsService.retryDownload(j4, downloadReadUseCaseImpl$invokeRetry$1);
                    xn.a aVar = xn.a.f37986a;
                    if (obj == aVar) {
                        return aVar;
                    }
                    downloadReadUseCaseImpl = this;
                }
                handleResult$default(downloadReadUseCaseImpl, (DownloadReadResult) obj, null, 2, null);
                return z.f31622a;
            }
        }
        downloadReadUseCaseImpl$invokeRetry$1 = new DownloadReadUseCaseImpl$invokeRetry$1(this, cVar);
        Object obj2 = downloadReadUseCaseImpl$invokeRetry$1.result;
        i10 = downloadReadUseCaseImpl$invokeRetry$1.label;
        if (i10 == 0) {
        }
        handleResult$default(downloadReadUseCaseImpl, (DownloadReadResult) obj2, null, 2, null);
        return z.f31622a;
    }
}
