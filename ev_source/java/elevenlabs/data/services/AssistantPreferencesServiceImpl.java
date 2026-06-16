package io.elevenlabs.data.services;

import android.content.SharedPreferences;
import com.google.protobuf.c6;
import io.elevenlabs.data.extensions.SharedPreferencesExtensionsKt;
import io.elevenlabs.di.UserSharedPreferences;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.domain.model.UserConfigRequest;
import io.elevenlabs.domain.services.AssistantInteractionMode;
import io.elevenlabs.domain.services.AssistantPreferencesService;
import io.elevenlabs.domain.services.UserConfigService;
import ir.r;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import sn.z;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000  2\u00020\u0001:\u0001 B\u001b\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fH\u0096@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0013\u0010\u0010J\u0017\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u0017\u0010\u000bJ\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\f2\u0006\u0010\u001b\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001f¨\u0006!"}, d2 = {"Lio/elevenlabs/data/services/AssistantPreferencesServiceImpl;", "Lio/elevenlabs/domain/services/AssistantPreferencesService;", "Landroid/content/SharedPreferences;", "userPreferences", "Lio/elevenlabs/domain/services/UserConfigService;", "userConfigService", "<init>", "(Landroid/content/SharedPreferences;Lio/elevenlabs/domain/services/UserConfigService;)V", "Lir/i;", "", "hasAcceptedTerms", "()Lir/i;", "Lsn/z;", "acceptTerms", "(Lwn/c;)Ljava/lang/Object;", "hasSeenExplainer", "()Z", "markExplainerSeen", "()V", AssistantPreferencesServiceImpl.KEY_ASSISTANT_ENABLED, "enabled", "setAssistantEnabled", "(Z)V", "observeAssistantEnabled", "Lio/elevenlabs/domain/services/AssistantInteractionMode;", "getLastInteractionMode", "()Lio/elevenlabs/domain/services/AssistantInteractionMode;", "mode", "setLastInteractionMode", "(Lio/elevenlabs/domain/services/AssistantInteractionMode;)V", "Landroid/content/SharedPreferences;", "Lio/elevenlabs/domain/services/UserConfigService;", "Companion", "data_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class AssistantPreferencesServiceImpl implements AssistantPreferencesService {
    private static final String KEY_ASSISTANT_ENABLED = "isAssistantEnabled";
    private static final String KEY_EXPLAINER = "hasSeenAssistantExplainer";
    private static final String KEY_LAST_INTERACTION_MODE = "lastAssistantInteractionMode";
    private final UserConfigService userConfigService;
    private final SharedPreferences userPreferences;

    public AssistantPreferencesServiceImpl(@UserSharedPreferences SharedPreferences sharedPreferences, UserConfigService userConfigService) {
        sharedPreferences.getClass();
        userConfigService.getClass();
        this.userPreferences = sharedPreferences;
        this.userConfigService = userConfigService;
    }

    @Override // io.elevenlabs.domain.services.AssistantPreferencesService
    public Object acceptTerms(wn.c<? super z> cVar) {
        Object saveAsync = this.userConfigService.saveAsync(new UserConfigRequest(null, null, null, null, null, null, null, null, null, null, new Long(System.currentTimeMillis()), 1023, null), cVar);
        if (saveAsync == xn.a.f37986a) {
            return saveAsync;
        }
        return z.f31622a;
    }

    @Override // io.elevenlabs.domain.services.AssistantPreferencesService
    public AssistantInteractionMode getLastInteractionMode() {
        Object lVar;
        Object obj = null;
        String string = this.userPreferences.getString(KEY_LAST_INTERACTION_MODE, null);
        if (string != null) {
            try {
                lVar = AssistantInteractionMode.valueOf(string);
            } catch (Throwable th) {
                lVar = new sn.l(th);
            }
            if (!(lVar instanceof sn.l)) {
                obj = lVar;
            }
            AssistantInteractionMode assistantInteractionMode = (AssistantInteractionMode) obj;
            if (assistantInteractionMode != null) {
                return assistantInteractionMode;
            }
        }
        return AssistantInteractionMode.VOICE;
    }

    @Override // io.elevenlabs.domain.services.AssistantPreferencesService
    public ir.i hasAcceptedTerms() {
        final ir.i config = this.userConfigService.getConfig();
        return r.o(new ir.i() { // from class: io.elevenlabs.data.services.AssistantPreferencesServiceImpl$hasAcceptedTerms$$inlined$map$1

            /* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
            @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
            /* renamed from: io.elevenlabs.data.services.AssistantPreferencesServiceImpl$hasAcceptedTerms$$inlined$map$1$2, reason: invalid class name */
            /* loaded from: classes3.dex */
            public static final class AnonymousClass2<T> implements ir.j {
                final /* synthetic */ ir.j $this_unsafeFlow;

                @yn.e(c = "io.elevenlabs.data.services.AssistantPreferencesServiceImpl$hasAcceptedTerms$$inlined$map$1$2", f = "AssistantPreferencesServiceImpl.kt", l = {50}, m = "emit", v = 2)
                @Metadata(k = 3, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
                /* renamed from: io.elevenlabs.data.services.AssistantPreferencesServiceImpl$hasAcceptedTerms$$inlined$map$1$2$1, reason: invalid class name */
                /* loaded from: classes3.dex */
                public static final class AnonymousClass1 extends yn.c {
                    int I$0;
                    Object L$0;
                    Object L$1;
                    Object L$2;
                    Object L$3;
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

                /* JADX WARN: Removed duplicated region for block: B:15:0x0034  */
                /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
                @Override // ir.j
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final Object emit(Object obj, wn.c cVar) {
                    AnonymousClass1 anonymousClass1;
                    int i10;
                    boolean z6;
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
                                if (((UserConfig) obj).getVoiceAssistantTermsAgreedAt() != null) {
                                    z6 = true;
                                } else {
                                    z6 = false;
                                }
                                Boolean valueOf = Boolean.valueOf(z6);
                                anonymousClass1.L$0 = null;
                                anonymousClass1.L$1 = null;
                                anonymousClass1.L$2 = null;
                                anonymousClass1.L$3 = null;
                                anonymousClass1.I$0 = 0;
                                anonymousClass1.label = 1;
                                Object emit = jVar.emit(valueOf, anonymousClass1);
                                xn.a aVar = xn.a.f37986a;
                                if (emit == aVar) {
                                    return aVar;
                                }
                            }
                            return z.f31622a;
                        }
                    }
                    anonymousClass1 = new AnonymousClass1(cVar);
                    Object obj22 = anonymousClass1.result;
                    i10 = anonymousClass1.label;
                    if (i10 == 0) {
                    }
                    return z.f31622a;
                }
            }

            @Override // ir.i
            public Object collect(ir.j jVar, wn.c cVar) {
                Object collect = ir.i.this.collect(new AnonymousClass2(jVar), cVar);
                if (collect == xn.a.f37986a) {
                    return collect;
                }
                return z.f31622a;
            }
        });
    }

    @Override // io.elevenlabs.domain.services.AssistantPreferencesService
    public boolean hasSeenExplainer() {
        return this.userPreferences.getBoolean(KEY_EXPLAINER, false);
    }

    @Override // io.elevenlabs.domain.services.AssistantPreferencesService
    public boolean isAssistantEnabled() {
        return this.userPreferences.getBoolean(KEY_ASSISTANT_ENABLED, true);
    }

    @Override // io.elevenlabs.domain.services.AssistantPreferencesService
    public void markExplainerSeen() {
        SharedPreferences.Editor edit = this.userPreferences.edit();
        edit.putBoolean(KEY_EXPLAINER, true);
        edit.apply();
    }

    @Override // io.elevenlabs.domain.services.AssistantPreferencesService
    public ir.i observeAssistantEnabled() {
        return SharedPreferencesExtensionsKt.observe(this.userPreferences, KEY_ASSISTANT_ENABLED, new AssistantPreferencesServiceImpl$observeAssistantEnabled$1(null));
    }

    @Override // io.elevenlabs.domain.services.AssistantPreferencesService
    public void setAssistantEnabled(boolean enabled) {
        SharedPreferences.Editor edit = this.userPreferences.edit();
        edit.putBoolean(KEY_ASSISTANT_ENABLED, enabled);
        edit.apply();
    }

    @Override // io.elevenlabs.domain.services.AssistantPreferencesService
    public void setLastInteractionMode(AssistantInteractionMode mode) {
        mode.getClass();
        SharedPreferences.Editor edit = this.userPreferences.edit();
        edit.putString(KEY_LAST_INTERACTION_MODE, mode.name());
        edit.apply();
    }
}
