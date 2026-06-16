package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.OfflineReadData;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.ReadMetaKt;
import io.elevenlabs.domain.services.OfflineReadsService;
import io.elevenlabs.domain.usecase.DownloadReadUseCase;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerViewModel$handleDownloadAction$1", f = "PlayerViewModel.kt", l = {2495, 2501, 2508}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class PlayerViewModel$handleDownloadAction$1 extends yn.i implements ho.p {
    final /* synthetic */ DownloadAction $action;
    final /* synthetic */ ReadMeta $readMeta;
    int I$0;
    long J$0;
    int label;
    final /* synthetic */ PlayerViewModel this$0;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[DownloadAction.values().length];
            try {
                iArr[DownloadAction.DOWNLOAD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DownloadAction.REMOVE_DOWNLOAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DownloadAction.CANCEL_DOWNLOAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DownloadAction.RETRY_DOWNLOAD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerViewModel$handleDownloadAction$1(DownloadAction downloadAction, ReadMeta readMeta, PlayerViewModel playerViewModel, wn.c<? super PlayerViewModel$handleDownloadAction$1> cVar) {
        super(2, cVar);
        this.$action = downloadAction;
        this.$readMeta = readMeta;
        this.this$0 = playerViewModel;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new PlayerViewModel$handleDownloadAction$1(this.$action, this.$readMeta, this.this$0, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((PlayerViewModel$handleDownloadAction$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0129 A[RETURN] */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        jl.a aVar;
        jl.a aVar2;
        jl.a aVar3;
        int i10 = this.label;
        sn.z zVar = sn.z.f31622a;
        if (i10 != 0) {
            if (i10 == 1 || i10 == 2 || i10 == 3) {
                sn.a.g(obj);
            } else {
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            sn.a.g(obj);
            int i11 = WhenMappings.$EnumSwitchMapping$0[this.$action.ordinal()];
            xn.a aVar4 = xn.a.f37986a;
            if (i11 != 1) {
                if (i11 != 2 && i11 != 3) {
                    if (i11 == 4) {
                        OfflineReadData offlineReadData = this.$readMeta.getOfflineReadData();
                        if (offlineReadData != null) {
                            long offlineReadId = offlineReadData.getOfflineReadId();
                            PlayerViewModel playerViewModel = this.this$0;
                            ReadMeta readMeta = this.$readMeta;
                            playerViewModel.logger.log(playerViewModel.tag, "Retrying download for read: " + readMeta.getReadId());
                            aVar3 = playerViewModel.downloadReadUseCase;
                            DownloadReadUseCase downloadReadUseCase = (DownloadReadUseCase) aVar3.get();
                            this.J$0 = offlineReadId;
                            this.I$0 = 0;
                            this.label = 3;
                            if (downloadReadUseCase.invokeRetry(offlineReadId, this) == aVar4) {
                            }
                        }
                    } else {
                        c6.p();
                        return null;
                    }
                } else {
                    OfflineReadData offlineReadData2 = this.$readMeta.getOfflineReadData();
                    if (offlineReadData2 != null) {
                        long offlineReadId2 = offlineReadData2.getOfflineReadId();
                        PlayerViewModel playerViewModel2 = this.this$0;
                        playerViewModel2.logger.log(playerViewModel2.tag, "Removing / cancelling download with id: " + offlineReadId2);
                        aVar2 = playerViewModel2.offlineReadsService;
                        OfflineReadsService offlineReadsService = (OfflineReadsService) aVar2.get();
                        this.J$0 = offlineReadId2;
                        this.I$0 = 0;
                        this.label = 2;
                        if (offlineReadsService.removeDownload(offlineReadId2, this) == aVar4) {
                            return aVar4;
                        }
                    }
                }
            } else if (ReadMetaKt.isMediaType(this.$readMeta) || this.$readMeta.getCharCount() <= 600000) {
                aVar = this.this$0.downloadReadUseCase;
                DownloadReadUseCase downloadReadUseCase2 = (DownloadReadUseCase) aVar.get();
                String readId = this.$readMeta.getReadId();
                long charCount = this.$readMeta.getCharCount();
                this.label = 1;
                if (downloadReadUseCase2.invoke(readId, charCount, this) == aVar4) {
                }
            } else {
                Logger logger = this.this$0.logger;
                String str = this.this$0.tag;
                StringBuilder r10 = com.google.android.gms.internal.play_billing.b.r("Read ", this.$readMeta.getReadId(), this.$readMeta.getCharCount(), " exceeds full-download limit (");
                r10.append(" > 600000 chars), redirecting to per-chapter downloads");
                logger.log(str, r10.toString());
                this.this$0.queueStateUpdate(new i1(9));
                return zVar;
            }
        }
        return zVar;
    }
}
