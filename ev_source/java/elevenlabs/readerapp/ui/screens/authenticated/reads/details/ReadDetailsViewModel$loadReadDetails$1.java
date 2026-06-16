package io.elevenlabs.readerapp.ui.screens.authenticated.reads.details;

import com.google.protobuf.c6;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.AsyncCallResult;
import io.elevenlabs.domain.model.ExplorePricingType;
import io.elevenlabs.domain.model.PaymentConfig;
import io.elevenlabs.domain.model.ReadDetailsButtons;
import io.elevenlabs.domain.model.ReadDetailsResponse;
import io.elevenlabs.domain.services.ReadsService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$loadReadDetails$1", f = "ReadDetailsViewModel.kt", l = {438, 438}, m = "invokeSuspend", v = 2)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
/* loaded from: classes4.dex */
public final class ReadDetailsViewModel$loadReadDetails$1 extends yn.i implements ho.p {
    final /* synthetic */ String $readId;
    int label;
    final /* synthetic */ ReadDetailsViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReadDetailsViewModel$loadReadDetails$1(ReadDetailsViewModel readDetailsViewModel, String str, wn.c<? super ReadDetailsViewModel$loadReadDetails$1> cVar) {
        super(2, cVar);
        this.this$0 = readDetailsViewModel;
        this.$readId = str;
    }

    @Override // yn.a
    public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
        return new ReadDetailsViewModel$loadReadDetails$1(this.this$0, this.$readId, cVar);
    }

    @Override // ho.p
    public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
        return ((ReadDetailsViewModel$loadReadDetails$1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
    
        if (((ir.i) r5).collect(r0, r4) == r3) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        if (r5 == r3) goto L33;
     */
    @Override // yn.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        ReadsService readsService;
        int i10 = this.label;
        xn.a aVar = xn.a.f37986a;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    sn.a.g(obj);
                    return sn.z.f31622a;
                }
                c6.x("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            sn.a.g(obj);
        } else {
            sn.a.g(obj);
            readsService = this.this$0.readsService;
            String str = this.$readId;
            this.label = 1;
            obj = readsService.getReadDetailsSections(str, this);
        }
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0);
        this.label = 2;
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.reads.details.ReadDetailsViewModel$loadReadDetails$1$1 */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1<T> implements ir.j {
        final /* synthetic */ ReadDetailsViewModel this$0;

        public AnonymousClass1(ReadDetailsViewModel readDetailsViewModel) {
            this.this$0 = readDetailsViewModel;
        }

        public static final ReadDetailsState emit$lambda$0(ReadDetailsResponse readDetailsResponse, ReadDetailsState readDetailsState) {
            String str;
            readDetailsState.getClass();
            ExplorePricingType pricingType = readDetailsResponse.getPricingType();
            PaymentConfig paymentConfig = readDetailsResponse.getPaymentConfig();
            String previewUrl = readDetailsResponse.getPreviewUrl();
            String sampleReadId = readDetailsResponse.getSampleReadId();
            ReadDetailsButtons buttons = readDetailsResponse.getButtons();
            if (buttons != null) {
                str = buttons.getDisabledReason();
            } else {
                str = null;
            }
            return ReadDetailsState.copy$default(readDetailsState, null, false, readDetailsResponse, null, false, false, null, false, pricingType, null, false, null, paymentConfig, previewUrl, sampleReadId, false, null, null, false, false, false, null, null, false, str, readDetailsResponse.getInReadLater(), false, 83857067, null);
        }

        public static final ReadDetailsState emit$lambda$1(String str, ReadDetailsState readDetailsState) {
            readDetailsState.getClass();
            return ReadDetailsState.copy$default(readDetailsState, null, false, null, null, false, false, str, false, null, null, false, null, null, null, null, false, null, null, false, false, false, null, null, false, null, false, false, 134217643, null);
        }

        public final Object emit(AsyncCallResult<ReadDetailsResponse> asyncCallResult, wn.c<? super sn.z> cVar) {
            ResolveErrorMessageUseCase resolveErrorMessageUseCase;
            String str;
            Logger logger;
            boolean z6;
            String str2 = null;
            if (asyncCallResult instanceof AsyncCallResult.Success) {
                ReadDetailsResponse readDetailsResponse = (ReadDetailsResponse) ((AsyncCallResult.Success) asyncCallResult).getData();
                this.this$0.queueStateUpdate(new j0(readDetailsResponse, 1));
                PaymentConfig paymentConfig = readDetailsResponse.getPaymentConfig();
                if (paymentConfig != null) {
                    str = paymentConfig.getAndroidProductId();
                } else {
                    str = null;
                }
                logger = this.this$0.logger;
                ExplorePricingType pricingType = readDetailsResponse.getPricingType();
                if (str != null) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                PaymentConfig paymentConfig2 = readDetailsResponse.getPaymentConfig();
                if (paymentConfig2 != null) {
                    str2 = paymentConfig2.getPriceFormatted();
                }
                logger.log("ReadDetailsViewModel", "paymentConfig: pricingType=" + pricingType + ", androidProductId=" + str + ", canBePurchasedIndividually=" + z6 + ", fallbackPriceFormatted=" + str2);
                if (str != null) {
                    this.this$0.loadStoreProduct(str);
                }
                this.this$0.fetchCarouselPrices(readDetailsResponse.getSections());
            } else if (asyncCallResult instanceof AsyncCallResult.Error) {
                resolveErrorMessageUseCase = this.this$0.resolveErrorMessageUseCase;
                this.this$0.queueStateUpdate(new k0(ResolveErrorMessageUseCase.invoke$default(resolveErrorMessageUseCase, (AsyncCallResult.Error) asyncCallResult, null, 2, null), 2));
            } else {
                c6.p();
                return null;
            }
            return sn.z.f31622a;
        }

        @Override // ir.j
        public /* bridge */ /* synthetic */ Object emit(Object obj, wn.c cVar) {
            return emit((AsyncCallResult<ReadDetailsResponse>) obj, (wn.c<? super sn.z>) cVar);
        }
    }
}
