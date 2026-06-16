package io.elevenlabs.readerapp.ui.screens.authenticated;

import android.icu.util.Calendar;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.google.protobuf.c6;
import fr.k1;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.Customer;
import io.elevenlabs.domain.model.OnboardingSurvey;
import io.elevenlabs.domain.model.Voice;
import io.elevenlabs.domain.services.CustomerService;
import io.elevenlabs.domain.services.RecentVoicesService;
import io.elevenlabs.domain.usecase.ResolveErrorMessageUseCase;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingPage;
import io.livekit.android.room.SignalClient;
import ir.z1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0093\u0001\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u0005\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0005\u0012\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u0005\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0005\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020 ¢\u0006\u0004\b#\u0010$J\r\u0010&\u001a\u00020%¢\u0006\u0004\b&\u0010'J\u0015\u0010*\u001a\u00020 2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J\r\u0010,\u001a\u00020%¢\u0006\u0004\b,\u0010'J\u0017\u0010/\u001a\u00020%2\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0015\u00103\u001a\u00020%2\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J+\u00108\u001a\u00020%2\u0006\u0010.\u001a\u00020-2\u0006\u00105\u001a\u00020\u00022\f\u00107\u001a\b\u0012\u0004\u0012\u00020%06¢\u0006\u0004\b8\u00109J\r\u0010:\u001a\u00020 ¢\u0006\u0004\b:\u0010$J\u001d\u0010=\u001a\u00020 2\u0006\u00102\u001a\u0002012\u0006\u0010<\u001a\u00020;¢\u0006\u0004\b=\u0010>J\u0015\u0010?\u001a\u00020 2\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b?\u0010+J\u000f\u0010@\u001a\u00020 H\u0002¢\u0006\u0004\b@\u0010$J\u000f\u0010A\u001a\u00020 H\u0002¢\u0006\u0004\bA\u0010$J\u0017\u0010C\u001a\u00020B2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\bC\u0010DJ\u0017\u0010E\u001a\u00020 2\u0006\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u00020 H\u0002¢\u0006\u0004\bG\u0010$J\u0017\u0010H\u001a\u00020\u00022\u0006\u00105\u001a\u00020\u0002H\u0002¢\u0006\u0004\bH\u0010IR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010JR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010KR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010JR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010JR\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010JR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010JR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010LR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010MR\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010JR\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010JR\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006R"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Ljl/a;", "Lio/elevenlabs/domain/services/OnboardingService;", "onboardingService", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "resolveErrorMessageUseCase", "Lio/elevenlabs/domain/services/AudioPreviewService;", "audioPreviewService", "Lio/elevenlabs/domain/services/VoicesService;", "voicesService", "Lio/elevenlabs/domain/services/ToastService;", "toastService", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "Lio/elevenlabs/domain/Analytics;", "analytics", "Lio/elevenlabs/domain/services/RecentVoicesService;", "recentVoicesService", "Lcom/revenuecat/purchases/Purchases;", "purchases", "Lio/elevenlabs/domain/services/CustomerService;", "customerService", "Lio/elevenlabs/domain/Logger;", "logger", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Ljl/a;Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;Ljl/a;Ljl/a;Ljl/a;Ljl/a;Lio/elevenlabs/domain/Analytics;Lio/elevenlabs/domain/services/RecentVoicesService;Ljl/a;Ljl/a;Lio/elevenlabs/domain/Logger;)V", "Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingType;", "onboardingType", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "initialize", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingType;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "completeOnboarding", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "Lsn/z;", "retryVoiceSuggestions", "()V", "Lio/elevenlabs/domain/model/Voice;", "voice", "selectVoice", "(Lio/elevenlabs/domain/model/Voice;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "trackVoiceSelection", "", "birthdayUnix", "trackDOBSelection", "(Ljava/lang/Long;)V", "Lio/elevenlabs/domain/model/OnboardingSurvey$Question;", "question", "trackSurveyQuestionAnalytics", "(Lio/elevenlabs/domain/model/OnboardingSurvey$Question;)V", RemoteConfigConstants.ResponseFieldKey.STATE, "Lkotlin/Function0;", "goNext", "validateAndProcessAge", "(JLio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingState;Lho/a;)V", "hideAgeWarning", "Lio/elevenlabs/domain/model/OnboardingSurvey$Answer;", SignalClient.SD_TYPE_ANSWER, "toggleAnswer", "(Lio/elevenlabs/domain/model/OnboardingSurvey$Question;Lio/elevenlabs/domain/model/OnboardingSurvey$Answer;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "togglePreview", "completeAgeOnlyOnboarding", "loadVoiceSuggestions", "", "isUserOldEnough", "(J)Z", "onBirthdaySelected", "(J)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "showAgeWarning", "updatePages", "(Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingState;)Lio/elevenlabs/readerapp/ui/screens/authenticated/OnboardingState;", "Ljl/a;", "Lio/elevenlabs/domain/usecase/ResolveErrorMessageUseCase;", "Lio/elevenlabs/domain/Analytics;", "Lio/elevenlabs/domain/services/RecentVoicesService;", "Lio/elevenlabs/domain/Logger;", "Lfr/k1;", "lastPreviewPlayJob", "Lfr/k1;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class OnboardingViewModel extends MviViewModel<OnboardingState> {
    public static final int $stable = 8;
    private final Analytics analytics;
    private final jl.a audioPreviewService;
    private final jl.a customerService;
    private k1 lastPreviewPlayJob;
    private final Logger logger;
    private final jl.a onboardingService;
    private final jl.a purchases;
    private final RecentVoicesService recentVoicesService;
    private final ResolveErrorMessageUseCase resolveErrorMessageUseCase;
    private final jl.a stringProvider;
    private final jl.a toastService;
    private final jl.a voicesService;

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel$1", f = "OnboardingScreen.kt", l = {147}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel$1, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass1 extends yn.i implements ho.p {
        int label;

        public AnonymousClass1(wn.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass1) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        @Override // yn.a
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 == 1) {
                    sn.a.g(obj);
                } else {
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                sn.a.g(obj);
                final z1 stateFlow = OnboardingViewModel.this.getStateFlow();
                ir.i o6 = ir.r.o(new ir.i() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel$1$invokeSuspend$$inlined$mapNotNull$1

                    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
                    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    /* loaded from: classes4.dex */
                    public static final class AnonymousClass2<T> implements ir.j {
                        final /* synthetic */ ir.j $this_unsafeFlow;

                        @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2", f = "OnboardingScreen.kt", l = {52}, m = "emit", v = 2)
                        @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                        /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        /* loaded from: classes4.dex */
                        public static final class AnonymousClass1 extends yn.c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            Object L$4;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(wn.c cVar) {
                                super(cVar);
                            }

                            @Override // yn.a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(ir.j jVar) {
                            this.$this_unsafeFlow = jVar;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:15:0x0038  */
                        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                        @Override // ir.j
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                        */
                        public final Object emit(Object obj, wn.c cVar) {
                            AnonymousClass1 anonymousClass1;
                            int i10;
                            if (cVar instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) cVar;
                                int i11 = anonymousClass1.label;
                                if ((i11 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i11 - Integer.MIN_VALUE;
                                    Object obj2 = anonymousClass1.result;
                                    i10 = anonymousClass1.label;
                                    if (i10 == 0) {
                                        if (i10 == 1) {
                                            sn.a.g(obj2);
                                        } else {
                                            c6.x("call to 'resume' before 'invoke' with coroutine");
                                            return null;
                                        }
                                    } else {
                                        sn.a.g(obj2);
                                        ir.j jVar = this.$this_unsafeFlow;
                                        OnboardingType onboardingType = ((OnboardingState) obj).getOnboardingType();
                                        if (onboardingType != null) {
                                            anonymousClass1.L$0 = null;
                                            anonymousClass1.L$1 = null;
                                            anonymousClass1.L$2 = null;
                                            anonymousClass1.L$3 = null;
                                            anonymousClass1.L$4 = null;
                                            anonymousClass1.I$0 = 0;
                                            anonymousClass1.label = 1;
                                            Object emit = jVar.emit(onboardingType, anonymousClass1);
                                            xn.a aVar = xn.a.f37986a;
                                            if (emit == aVar) {
                                                return aVar;
                                            }
                                        }
                                    }
                                    return sn.z.f31622a;
                                }
                            }
                            anonymousClass1 = new AnonymousClass1(cVar);
                            Object obj22 = anonymousClass1.result;
                            i10 = anonymousClass1.label;
                            if (i10 == 0) {
                            }
                            return sn.z.f31622a;
                        }
                    }

                    @Override // ir.i
                    public Object collect(ir.j jVar, wn.c cVar) {
                        Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                        if (collect == xn.a.f37986a) {
                            return collect;
                        }
                        return sn.z.f31622a;
                    }
                });
                final OnboardingViewModel onboardingViewModel = OnboardingViewModel.this;
                ir.j jVar = new ir.j() { // from class: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel.1.2
                    public final Object emit(OnboardingType onboardingType, wn.c<? super sn.z> cVar) {
                        OnboardingViewModel.this.loadVoiceSuggestions();
                        return sn.z.f31622a;
                    }

                    @Override // ir.j
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, wn.c cVar) {
                        return emit((OnboardingType) obj2, (wn.c<? super sn.z>) cVar);
                    }
                };
                this.label = 1;
                Object collect = o6.collect(jVar, this);
                xn.a aVar = xn.a.f37986a;
                if (collect == aVar) {
                    return aVar;
                }
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @yn.e(c = "io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel$2", f = "OnboardingScreen.kt", l = {ModuleDescriptor.MODULE_VERSION, 157}, m = "invokeSuspend", v = 2)
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lfr/d0;", "Lsn/z;", "<anonymous>", "(Lfr/d0;)V"}, k = 3, mv = {2, 3, 0})
    /* renamed from: io.elevenlabs.readerapp.ui.screens.authenticated.OnboardingViewModel$2, reason: invalid class name */
    /* loaded from: classes4.dex */
    public static final class AnonymousClass2 extends yn.i implements ho.p {
        Object L$0;
        int label;

        public AnonymousClass2(wn.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
        }

        @Override // yn.a
        public final wn.c<sn.z> create(Object obj, wn.c<?> cVar) {
            return new AnonymousClass2(cVar);
        }

        @Override // ho.p
        public final Object invoke(fr.d0 d0Var, wn.c<? super sn.z> cVar) {
            return ((AnonymousClass2) create(d0Var, cVar)).invokeSuspend(sn.z.f31622a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        
            if (com.revenuecat.purchases.CoroutinesExtensionsCommonKt.awaitOfferings((com.revenuecat.purchases.Purchases) r6, r5) == r4) goto L25;
         */
        @Override // yn.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            int i10 = this.label;
            xn.a aVar = xn.a.f37986a;
            try {
            } catch (CancellationException e10) {
                throw e10;
            } catch (Exception e11) {
                ib.i.r("Failed to preload offerings: ", e11.getMessage(), OnboardingViewModel.this.logger, "Onboarding");
            }
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 == 2) {
                        sn.a.g(obj);
                        OnboardingViewModel.this.logger.log("Onboarding", "Preloaded RevenueCat offerings");
                        return sn.z.f31622a;
                    }
                    c6.x("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                sn.a.g(obj);
            } else {
                sn.a.g(obj);
                ir.i customer = ((CustomerService) OnboardingViewModel.this.customerService.get()).getCustomer();
                this.label = 1;
                obj = ir.r.u(customer, this);
                if (obj == aVar) {
                    return aVar;
                }
            }
            if (((Customer) obj).isFreeUser()) {
                Object obj2 = OnboardingViewModel.this.purchases.get();
                obj2.getClass();
                this.L$0 = null;
                this.label = 2;
            }
            return sn.z.f31622a;
        }
    }

    /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
    @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
    /* loaded from: classes4.dex */
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OnboardingType.values().length];
            try {
                iArr[OnboardingType.AgeOnly.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnboardingType.DynamicQuestions.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OnboardingType.Entire.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public OnboardingViewModel(DispatcherFactory dispatcherFactory, jl.a aVar, ResolveErrorMessageUseCase resolveErrorMessageUseCase, jl.a aVar2, jl.a aVar3, jl.a aVar4, jl.a aVar5, Analytics analytics, RecentVoicesService recentVoicesService, jl.a aVar6, jl.a aVar7, Logger logger) {
        super(new OnboardingState(null, false, null, null, null, null, false, false, null, null, false, 2047, null), dispatcherFactory, r3, 4, null);
        dispatcherFactory.getClass();
        aVar.getClass();
        resolveErrorMessageUseCase.getClass();
        aVar2.getClass();
        aVar3.getClass();
        aVar4.getClass();
        aVar5.getClass();
        analytics.getClass();
        recentVoicesService.getClass();
        aVar6.getClass();
        aVar7.getClass();
        logger.getClass();
        Logger logger2 = null;
        this.onboardingService = aVar;
        this.resolveErrorMessageUseCase = resolveErrorMessageUseCase;
        this.audioPreviewService = aVar2;
        this.voicesService = aVar3;
        this.toastService = aVar4;
        this.stringProvider = aVar5;
        this.analytics = analytics;
        this.recentVoicesService = recentVoicesService;
        this.purchases = aVar6;
        this.customerService = aVar7;
        this.logger = logger;
        analytics.log(Analytics.Event.IsSignedIn.INSTANCE);
        MviViewModel.launch$default(this, null, new AnonymousClass1(null), 1, null);
        MviViewModel.launch$default(this, null, new AnonymousClass2(null), 1, null);
    }

    private final MviViewModel.StateUpdate completeAgeOnlyOnboarding() {
        return queueStateUpdate(new w0(this, 3));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingState completeAgeOnlyOnboarding$lambda$0(OnboardingViewModel onboardingViewModel, OnboardingState onboardingState) {
        onboardingState.getClass();
        if (!onboardingState.getVoicesSuggestionsLoading() && onboardingState.getSurvey() != null && !onboardingState.isSubmitLoading()) {
            fr.g0.D(androidx.lifecycle.c1.h(onboardingViewModel), onboardingViewModel.getDispatcherFactory().getDefault(), null, new OnboardingViewModel$completeAgeOnlyOnboarding$1$1(onboardingState, onboardingViewModel, null), 2);
            return OnboardingState.copy$default(onboardingState, null, false, null, null, null, null, false, true, null, null, false, 1919, null);
        }
        return onboardingState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingState completeOnboarding$lambda$0(OnboardingViewModel onboardingViewModel, OnboardingState onboardingState) {
        onboardingState.getClass();
        if (!onboardingState.getVoicesSuggestionsLoading() && onboardingState.getSurvey() != null && !onboardingState.isSubmitLoading()) {
            fr.g0.D(androidx.lifecycle.c1.h(onboardingViewModel), onboardingViewModel.getDispatcherFactory().getDefault(), null, new OnboardingViewModel$completeOnboarding$1$1(onboardingState, onboardingViewModel, null), 2);
            return OnboardingState.copy$default(onboardingState, null, false, null, null, null, null, false, true, null, null, false, 1919, null);
        }
        return onboardingState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingState hideAgeWarning$lambda$0(OnboardingState onboardingState) {
        onboardingState.getClass();
        return OnboardingState.copy$default(onboardingState, null, false, null, null, null, null, false, false, null, null, false, 1983, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingState initialize$lambda$0(OnboardingType onboardingType, OnboardingState onboardingState) {
        onboardingState.getClass();
        return OnboardingState.copy$default(onboardingState, null, false, null, null, null, null, false, false, null, onboardingType, false, 1535, null);
    }

    private final boolean isUserOldEnough(long birthdayUnix) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(birthdayUnix * 1000);
        Calendar calendar2 = Calendar.getInstance();
        int i10 = calendar2.get(1) - calendar.get(1);
        if (calendar2.get(6) < calendar.get(6)) {
            i10--;
        }
        if (i10 >= 16) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final MviViewModel.StateUpdate loadVoiceSuggestions() {
        return queueStateUpdate(new w0(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingState loadVoiceSuggestions$lambda$0(OnboardingViewModel onboardingViewModel, OnboardingState onboardingState) {
        onboardingState.getClass();
        if (onboardingState.getVoicesSuggestionsLoading()) {
            return onboardingState;
        }
        fr.g0.D(androidx.lifecycle.c1.h(onboardingViewModel), onboardingViewModel.getDispatcherFactory().getDefault(), null, new OnboardingViewModel$loadVoiceSuggestions$1$1(onboardingViewModel, null), 2);
        return OnboardingState.copy$default(onboardingState, null, true, null, null, null, null, false, false, null, null, false, 2037, null);
    }

    private final MviViewModel.StateUpdate onBirthdaySelected(long birthdayUnix) {
        return queueStateUpdate(new a2.g(birthdayUnix, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingState onBirthdaySelected$lambda$0(long j4, OnboardingState onboardingState) {
        onboardingState.getClass();
        OnboardingSurvey survey = onboardingState.getSurvey();
        OnboardingSurvey onboardingSurvey = null;
        if (survey != null) {
            onboardingSurvey = OnboardingSurvey.copy$default(survey, Long.valueOf(j4), null, 2, null);
        }
        return OnboardingState.copy$default(onboardingState, onboardingSurvey, false, null, null, null, null, false, false, null, null, false, 2046, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingState selectVoice$lambda$0(OnboardingViewModel onboardingViewModel, Voice voice, OnboardingState onboardingState) {
        onboardingState.getClass();
        onboardingViewModel.togglePreview(voice);
        return OnboardingState.copy$default(onboardingState, null, false, null, null, null, voice.getVoiceId(), false, false, null, null, false, 2015, null);
    }

    private final MviViewModel.StateUpdate showAgeWarning() {
        return queueStateUpdate(new y0(8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingState showAgeWarning$lambda$0(OnboardingState onboardingState) {
        onboardingState.getClass();
        return OnboardingState.copy$default(onboardingState, null, false, null, null, null, null, true, false, null, null, false, 1983, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingState toggleAnswer$lambda$0(OnboardingSurvey.Question question, OnboardingSurvey.Answer answer, OnboardingState onboardingState) {
        onboardingState.getClass();
        if (onboardingState.getSurvey() == null) {
            return onboardingState;
        }
        OnboardingSurvey survey = onboardingState.getSurvey();
        List<OnboardingSurvey.Question> questions = onboardingState.getSurvey().getQuestions();
        ArrayList arrayList = new ArrayList(tn.p.a0(questions, 10));
        for (OnboardingSurvey.Question question2 : questions) {
            if (kotlin.jvm.internal.m.c(question2.getKey(), question.getKey())) {
                List<OnboardingSurvey.Answer> answers = question2.getAnswers();
                ArrayList arrayList2 = new ArrayList(tn.p.a0(answers, 10));
                for (OnboardingSurvey.Answer answer2 : answers) {
                    if (kotlin.jvm.internal.m.c(answer2.getKey(), answer.getKey())) {
                        answer2 = OnboardingSurvey.Answer.copy$default(answer2, null, null, !answer2.getSelected(), null, 11, null);
                    } else if (question2.getSingleSelection()) {
                        answer2 = OnboardingSurvey.Answer.copy$default(answer2, null, null, false, null, 11, null);
                    }
                    arrayList2.add(answer2);
                }
                question2 = OnboardingSurvey.Question.copy$default(question2, null, null, false, arrayList2, false, 23, null);
            }
            arrayList.add(question2);
        }
        return OnboardingState.copy$default(onboardingState, OnboardingSurvey.copy$default(survey, null, arrayList, 1, null), false, null, null, null, null, false, false, null, null, false, 2046, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final OnboardingState togglePreview$lambda$0(OnboardingViewModel onboardingViewModel, Voice voice, OnboardingState onboardingState) {
        onboardingState.getClass();
        onboardingViewModel.analytics.log(Analytics.Event.VoicesClickedPlayVoice.INSTANCE);
        k1 k1Var = onboardingViewModel.lastPreviewPlayJob;
        if (k1Var != null) {
            k1Var.cancel((CancellationException) null);
        }
        if (!kotlin.jvm.internal.m.c(onboardingState.getPlayingPreviewVoiceId(), voice.getVoiceId())) {
            onboardingViewModel.lastPreviewPlayJob = fr.g0.D(androidx.lifecycle.c1.h(onboardingViewModel), onboardingViewModel.getDispatcherFactory().getDefault(), null, new OnboardingViewModel$togglePreview$1$1(voice, onboardingViewModel, null), 2);
            return OnboardingState.copy$default(onboardingState, null, false, null, null, voice.getVoiceId(), null, false, false, null, null, false, 2031, null);
        }
        return OnboardingState.copy$default(onboardingState, null, false, null, null, null, null, false, false, null, null, false, 2031, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [tn.t] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.ArrayList] */
    public final OnboardingState updatePages(OnboardingState state) {
        ArrayList arrayList;
        int i10;
        ArrayList arrayList2;
        List<OnboardingSurvey.Question> questions;
        OnboardingSurvey survey = state.getSurvey();
        ?? r12 = tn.t.f33547a;
        if (survey != null && (questions = survey.getQuestions()) != null) {
            arrayList = new ArrayList(tn.p.a0(questions, 10));
            int i11 = 0;
            for (Object obj : questions) {
                int i12 = i11 + 1;
                if (i11 >= 0) {
                    arrayList.add(new OnboardingPage.SurveyPage(i11));
                    i11 = i12;
                } else {
                    ig.f.U();
                    throw null;
                }
            }
        } else {
            arrayList = r12;
        }
        OnboardingType onboardingType = state.getOnboardingType();
        if (onboardingType == null) {
            i10 = -1;
        } else {
            i10 = WhenMappings.$EnumSwitchMapping$0[onboardingType.ordinal()];
        }
        if (i10 != -1) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 == 3) {
                        r12 = tn.o.O0(arrayList, OnboardingScreenKt.getDefaultPages());
                    } else {
                        c6.p();
                        return null;
                    }
                } else {
                    arrayList2 = arrayList;
                    return OnboardingState.copy$default(state, null, false, null, null, null, null, false, false, arrayList2, null, false, 1791, null);
                }
            } else {
                r12 = ig.f.H(OnboardingPage.Age.INSTANCE);
            }
        }
        arrayList2 = r12;
        return OnboardingState.copy$default(state, null, false, null, null, null, null, false, false, arrayList2, null, false, 1791, null);
    }

    public final MviViewModel.StateUpdate completeOnboarding() {
        return queueStateUpdate(new w0(this, 2));
    }

    public final MviViewModel.StateUpdate hideAgeWarning() {
        return queueStateUpdate(new y0(7));
    }

    public final MviViewModel.StateUpdate initialize(OnboardingType onboardingType) {
        onboardingType.getClass();
        return queueStateUpdate(new l0(onboardingType, 9));
    }

    public final void retryVoiceSuggestions() {
        loadVoiceSuggestions();
    }

    public final MviViewModel.StateUpdate selectVoice(Voice voice) {
        voice.getClass();
        return queueStateUpdate(new g1(this, voice, 1));
    }

    public final MviViewModel.StateUpdate toggleAnswer(OnboardingSurvey.Question question, OnboardingSurvey.Answer answer) {
        question.getClass();
        answer.getClass();
        return queueStateUpdate(new x0(question, answer, 1));
    }

    public final MviViewModel.StateUpdate togglePreview(Voice voice) {
        voice.getClass();
        return queueStateUpdate(new g1(this, voice, 0));
    }

    public final void trackDOBSelection(Long birthdayUnix) {
        Analytics.Event.OnboardingDOBInput onboardingDOBInput;
        if (birthdayUnix != null) {
            onboardingDOBInput = Analytics.Event.OnboardingDOBInput.SubmittedDOB;
        } else {
            onboardingDOBInput = Analytics.Event.OnboardingDOBInput.Skipped;
        }
        this.analytics.log(new Analytics.Event.OnboardingSelectedDOB(onboardingDOBInput));
    }

    public final void trackSurveyQuestionAnalytics(OnboardingSurvey.Question question) {
        question.getClass();
        String key = question.getKey();
        int hashCode = key.hashCode();
        if (hashCode != -896505829) {
            if (hashCode != 502611593) {
                if (hashCode == 1578702835 && key.equals("main_content")) {
                    List<OnboardingSurvey.Answer> answers = question.getAnswers();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : answers) {
                        if (((OnboardingSurvey.Answer) obj).getSelected()) {
                            arrayList.add(obj);
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(tn.p.a0(arrayList, 10));
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        arrayList2.add(((OnboardingSurvey.Answer) it.next()).getKey());
                    }
                    this.analytics.log(new Analytics.Event.OnboardingSelectedContentType(arrayList2));
                    return;
                }
                return;
            }
            if (key.equals("interests")) {
                List<OnboardingSurvey.Answer> answers2 = question.getAnswers();
                ArrayList arrayList3 = new ArrayList();
                for (Object obj2 : answers2) {
                    if (((OnboardingSurvey.Answer) obj2).getSelected()) {
                        arrayList3.add(obj2);
                    }
                }
                ArrayList arrayList4 = new ArrayList(tn.p.a0(arrayList3, 10));
                Iterator it2 = arrayList3.iterator();
                while (it2.hasNext()) {
                    arrayList4.add(((OnboardingSurvey.Answer) it2.next()).getKey());
                }
                this.analytics.log(new Analytics.Event.OnboardingSelectedTopics(arrayList4));
                return;
            }
            return;
        }
        if (key.equals("source")) {
            List<OnboardingSurvey.Answer> answers3 = question.getAnswers();
            ArrayList arrayList5 = new ArrayList();
            for (Object obj3 : answers3) {
                if (((OnboardingSurvey.Answer) obj3).getSelected()) {
                    arrayList5.add(obj3);
                }
            }
            OnboardingSurvey.Answer answer = (OnboardingSurvey.Answer) tn.o.y0(arrayList5);
            if (answer != null) {
                this.analytics.log(new Analytics.Event.OnboardingSelectedSource(answer.getKey()));
            }
        }
    }

    public final void trackVoiceSelection() {
        String selectedVoiceId = ((OnboardingState) getStateFlow().getValue()).getSelectedVoiceId();
        if (selectedVoiceId == null) {
            Voice voice = (Voice) tn.o.y0(((OnboardingState) getStateFlow().getValue()).getVoicesSuggestions());
            if (voice != null) {
                selectedVoiceId = voice.getVoiceId();
            } else {
                selectedVoiceId = null;
            }
        }
        if (selectedVoiceId != null) {
            this.analytics.log(new Analytics.Event.OnboardingSelectedVoice(selectedVoiceId));
        }
    }

    public final void validateAndProcessAge(long birthdayUnix, OnboardingState state, ho.a goNext) {
        state.getClass();
        goNext.getClass();
        if (isUserOldEnough(birthdayUnix)) {
            onBirthdaySelected(birthdayUnix);
            trackDOBSelection(Long.valueOf(birthdayUnix));
            if (state.getOnboardingType() == OnboardingType.AgeOnly) {
                completeAgeOnlyOnboarding();
                return;
            } else {
                goNext.invoke();
                return;
            }
        }
        showAgeWarning();
    }
}
