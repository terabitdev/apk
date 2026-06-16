package io.elevenlabs.readerapp.ui.screens.authenticated.reads;

import io.elevenlabs.domain.DispatcherFactory;
import io.elevenlabs.domain.StringProvider;
import io.elevenlabs.readerapp.R;
import io.elevenlabs.readerapp.core.MviViewModel;
import io.elevenlabs.readerapp.core.extensions.StringExtensionsKt;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0011\u001a\u00020\n¢\u0006\u0004\b\u0011\u0010\fR\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/PasteLinkViewModel;", "Lio/elevenlabs/readerapp/core/MviViewModel;", "Lio/elevenlabs/readerapp/ui/screens/authenticated/reads/PasteLinkState;", "Lio/elevenlabs/domain/DispatcherFactory;", "dispatcherFactory", "Ljl/a;", "Lio/elevenlabs/domain/StringProvider;", "stringProvider", "<init>", "(Lio/elevenlabs/domain/DispatcherFactory;Ljl/a;)V", "Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onListenClick", "()Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "", "url", "onUrlChanged", "(Ljava/lang/String;)Lio/elevenlabs/readerapp/core/MviViewModel$StateUpdate;", "onNavigated", "Ljl/a;", "app_productionRelease"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PasteLinkViewModel extends MviViewModel<PasteLinkState> {
    public static final int $stable = 8;
    private final jl.a stringProvider;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public PasteLinkViewModel(DispatcherFactory dispatcherFactory, jl.a aVar) {
        super(new PasteLinkState(null, null, null, 7, r5), dispatcherFactory, r3, 4, r5);
        dispatcherFactory.getClass();
        aVar.getClass();
        kotlin.jvm.internal.f fVar = null;
        Object[] objArr = 0 == true ? 1 : 0;
        this.stringProvider = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PasteLinkState onListenClick$lambda$0(PasteLinkViewModel pasteLinkViewModel, PasteLinkState pasteLinkState) {
        String url;
        pasteLinkState.getClass();
        if (!wq.u.W(pasteLinkState.getUrl(), "http://", false) && !wq.u.W(pasteLinkState.getUrl(), "https://", false)) {
            url = defpackage.f.i("https://", pasteLinkState.getUrl());
        } else {
            url = pasteLinkState.getUrl();
        }
        String str = url;
        if (StringExtensionsKt.toUrl(str) == null) {
            return PasteLinkState.copy$default(pasteLinkState, null, null, ((StringProvider) pasteLinkViewModel.stringProvider.get()).getString(R.string.paste_link_error_invalid), 3, null);
        }
        return PasteLinkState.copy$default(pasteLinkState, null, str, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PasteLinkState onNavigated$lambda$0(PasteLinkState pasteLinkState) {
        pasteLinkState.getClass();
        return PasteLinkState.copy$default(pasteLinkState, null, null, null, 5, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PasteLinkState onUrlChanged$lambda$0(String str, PasteLinkState pasteLinkState) {
        pasteLinkState.getClass();
        return PasteLinkState.copy$default(pasteLinkState, str, null, null, 6, null);
    }

    public final MviViewModel.StateUpdate onListenClick() {
        return queueStateUpdate(new l0(this, 1));
    }

    public final MviViewModel.StateUpdate onNavigated() {
        return queueStateUpdate(new e0(14));
    }

    public final MviViewModel.StateUpdate onUrlChanged(String url) {
        url.getClass();
        return queueStateUpdate(new r(url, 9));
    }
}
