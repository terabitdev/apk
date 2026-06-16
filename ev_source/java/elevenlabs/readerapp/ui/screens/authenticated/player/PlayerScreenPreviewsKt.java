package io.elevenlabs.readerapp.ui.screens.authenticated.player;

import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.elevenlabs.domain.model.Chapter;
import io.elevenlabs.domain.model.ChapterContent;
import io.elevenlabs.domain.model.ChapterSlot;
import io.elevenlabs.domain.model.HighlighterPositionConverter;
import io.elevenlabs.domain.model.PlayerConnectionState;
import io.elevenlabs.domain.model.PlayerDisplayMode;
import io.elevenlabs.domain.model.PlayerError;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.domain.model.UserConfig;
import io.elevenlabs.highlighter.HighlighterData;
import io.elevenlabs.readerapp.ui.previews.ReadsFactoryKt;
import io.elevenlabs.readerapp.ui.previews.UserConfigFactoryKt;
import io.elevenlabs.readerapp.ui.previews.VoicesFactoryKt;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlaybackPosition;
import io.elevenlabs.readerapp.ui.screens.authenticated.player.PlayerToastMessage;
import io.elevenlabs.ui.echo.EchoTheme;
import io.livekit.android.rpc.RpcError;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;
import livekit.org.webrtc.PeerConnection;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0005\u0010\u0002\u001a\u000f\u0010\u0006\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0006\u0010\u0002\u001a\u000f\u0010\u0007\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0007\u0010\u0002\u001a\u000f\u0010\b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\b\u0010\u0002\u001a\u000f\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\t\u0010\u0002\u001a\u000f\u0010\n\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u0002\u001a\u000f\u0010\u000b\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000b\u0010\u0002\u001a\u000f\u0010\f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\f\u0010\u0002\u001a\u000f\u0010\r\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\r\u0010\u0002\u001a\u000f\u0010\u000e\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000e\u0010\u0002\u001a\u000f\u0010\u000f\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u000f\u0010\u0002\u001a\u000f\u0010\u0010\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0010\u0010\u0002\u001a\u000f\u0010\u0011\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0011\u0010\u0002\u001a\u000f\u0010\u0012\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0012\u0010\u0002\u001a\u000f\u0010\u0013\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0013\u0010\u0002\u001a\u000f\u0010\u0014\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0014\u0010\u0002\u001a\u0019\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lsn/z;", "Preview_PlayerScreen_Idle", "(Lu2/m;I)V", "Preview_PlayerScreen_Loading_Content", "Preview_PlayerScreen_Loading_HtmlContent", "Preview_PlayerScreen_Loading_HtmlContent_50percent", "Preview_PlayerScreen_PlayerBuffering_NotPlaying", "Preview_PlayerScreen_PlayerBuffering_AndPlaying", "Preview_PlayerScreen_PlayerReady_AndPlaying", "Preview_PlayerScreen_PlayerReady_SleepTimer", "Preview_PlayerScreen_NotFollowingContent", "Preview_PlayerScreen_GenFM", "Preview_PlayerScreen_ShowsChaptersAndShare", "Preview_PlayerScreen_Error", "Preview_PlayerScreen_NetworkDisconnected", "Preview_PlayerScreen_Offline", "Preview_PlayerScreen_ControlsHidden", "Preview_PlayerScreen_Audio", "Preview_PlayerScreen_Audio_Dark", "Preview_PlayerScreen_Audio_SmallDevice", "Preview_PlayerScreen_Audio_LargeDevice", "", "followingContent", "Lio/elevenlabs/highlighter/HighlighterData;", "previewHighlighterData", "(Z)Lio/elevenlabs/highlighter/HighlighterData;", "app_productionRelease"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes4.dex */
public final class PlayerScreenPreviewsKt {
    public static final void Preview_PlayerScreen_Audio(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-244551891);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerScreenPreviewsKt.INSTANCE.getLambda$1456882195$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 27);
        }
    }

    public static final sn.z Preview_PlayerScreen_Audio$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_Audio(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_Audio_Dark(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1109504586);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerScreenPreviewsKt.INSTANCE.m1472getLambda$1199194332$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 20);
        }
    }

    public static final sn.z Preview_PlayerScreen_Audio_Dark$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_Audio_Dark(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_Audio_LargeDevice(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1382650149);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerScreenPreviewsKt.INSTANCE.getLambda$42801345$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 19);
        }
    }

    public static final sn.z Preview_PlayerScreen_Audio_LargeDevice$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_Audio_LargeDevice(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_Audio_SmallDevice(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-509647729);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerScreenPreviewsKt.INSTANCE.getLambda$915803765$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 14);
        }
    }

    public static final sn.z Preview_PlayerScreen_Audio_SmallDevice$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_Audio_SmallDevice(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_ControlsHidden(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-2123605239);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerDisplayMode playerDisplayMode = PlayerDisplayMode.Text;
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, new PlayerControllerState(PlayerConnectionState.READY, null, true, null, 10, null), false, false, 100, previewHighlighterData$default(false, 1, null), null, null, false, false, false, false, new ContentState(ReadsFactoryKt.stubReadMeta$default(null, 1, null), new PlaybackPosition.Tts(0L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, UserConfigFactoryKt.stubPlayerConfig(), false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, playerDisplayMode, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -20975679, 264237023, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 0);
        }
    }

    public static final sn.z Preview_PlayerScreen_ControlsHidden$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_ControlsHidden(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_Error(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(467108539);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, null, false, false, 100, null, null, "Error loading content. Please check your internet connection and try again.", false, false, false, false, null, null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, null, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -4194461, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 28);
        }
    }

    public static final sn.z Preview_PlayerScreen_Error$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_Error(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_GenFM(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-911882548);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, new PlayerControllerState(PlayerConnectionState.READY, null, true, null, 10, null), false, false, 100, previewHighlighterData(false), null, null, false, false, false, false, new ContentState(ReadsFactoryKt.stubReadMeta$default(null, 1, null), new PlaybackPosition.Tts(0L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, UserConfigFactoryKt.stubPlayerConfig(), false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -20975679, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 22);
        }
    }

    public static final sn.z Preview_PlayerScreen_GenFM$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_GenFM(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_Idle(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(975500405);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            EchoTheme.INSTANCE.invoke(null, ComposableSingletons$PlayerScreenPreviewsKt.INSTANCE.getLambda$476196047$app_productionRelease(), qVar, (EchoTheme.$stable << 6) | 48, 1);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 26);
        }
    }

    public static final sn.z Preview_PlayerScreen_Idle$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_Idle(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_Loading_Content(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-963875219);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, null, true, false, 0, null, null, null, false, false, false, false, null, null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, null, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -4194317, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 18);
        }
    }

    public static final sn.z Preview_PlayerScreen_Loading_Content$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_Loading_Content(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_Loading_HtmlContent(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1916995080);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, null, false, true, 0, previewHighlighterData$default(false, 1, null), null, null, false, false, false, false, new ContentState(ReadsFactoryKt.stubReadMeta$default(null, 1, null), new PlaybackPosition.Tts(0L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, null, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -4198445, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 29);
        }
    }

    public static final sn.z Preview_PlayerScreen_Loading_HtmlContent$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_Loading_HtmlContent(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_Loading_HtmlContent_50percent(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(629449293);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, null, false, true, 50, previewHighlighterData$default(false, 1, null), null, null, false, false, false, false, new ContentState(ReadsFactoryKt.stubReadMeta$default(null, 1, null), new PlaybackPosition.Tts(0L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, null, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -4198461, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 17);
        }
    }

    public static final sn.z Preview_PlayerScreen_Loading_HtmlContent_50percent$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_Loading_HtmlContent_50percent(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_NetworkDisconnected(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1055706534);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerError.Network network = PlayerError.Network.INSTANCE;
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, new PlayerControllerState(null, network, false, null, 13, null), false, false, 100, null, null, null, false, false, false, false, null, null, false, new PlayerToastMessage.PlayerError(network), false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, null, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -4227103, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 23);
        }
    }

    public static final sn.z Preview_PlayerScreen_NetworkDisconnected$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_NetworkDisconnected(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_NotFollowingContent(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(919476744);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, new PlayerControllerState(PlayerConnectionState.READY, null, true, null, 10, null), false, false, 100, previewHighlighterData(false), null, null, false, false, false, false, new ContentState(ReadsFactoryKt.stubReadMeta$default(null, 1, null), new PlaybackPosition.Tts(0L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, UserConfigFactoryKt.stubPlayerConfig(), false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -20975679, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 16);
        }
    }

    public static final sn.z Preview_PlayerScreen_NotFollowingContent$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_NotFollowingContent(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_Offline(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1509692352);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, new PlayerControllerState(PlayerConnectionState.READY, null, true, null, 10, null), false, false, 100, previewHighlighterData(false), null, null, false, false, false, false, new ContentState(ReadsFactoryKt.stubReadMeta$default(null, 1, null), new PlaybackPosition.Tts(0L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, UserConfigFactoryKt.stubPlayerConfig(), false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -20975679, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 13);
        }
    }

    public static final sn.z Preview_PlayerScreen_Offline$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_Offline(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_PlayerBuffering_AndPlaying(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(861501492);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, new PlayerControllerState(PlayerConnectionState.BUFFERING, null, true, null, 10, null), false, false, 100, previewHighlighterData$default(false, 1, null), null, null, false, false, false, false, new ContentState(ReadsFactoryKt.stubReadMeta$default(null, 1, null), new PlaybackPosition.Tts(0L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, UserConfigFactoryKt.stubPlayerConfig(), false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -20975679, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 21);
        }
    }

    public static final sn.z Preview_PlayerScreen_PlayerBuffering_AndPlaying$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_PlayerBuffering_AndPlaying(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_PlayerBuffering_NotPlaying(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-1056232400);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, new PlayerControllerState(PlayerConnectionState.BUFFERING, null, false, null, 10, null), false, false, 100, previewHighlighterData$default(false, 1, null), null, null, false, false, false, false, new ContentState(ReadsFactoryKt.stubReadMeta$default(null, 1, null), new PlaybackPosition.Tts(0L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, UserConfigFactoryKt.stubPlayerConfig(), false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -20975679, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 15);
        }
    }

    public static final sn.z Preview_PlayerScreen_PlayerBuffering_NotPlaying$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_PlayerBuffering_NotPlaying(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_PlayerReady_AndPlaying(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(1426609653);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, new PlayerControllerState(PlayerConnectionState.READY, null, true, null, 10, null), false, false, 100, previewHighlighterData$default(false, 1, null), null, null, false, false, false, false, new ContentState(ReadsFactoryKt.stubReadMeta$default(null, 1, null), new PlaybackPosition.Tts(0L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, UserConfigFactoryKt.stubPlayerConfig(), false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -20975679, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new j1(i10, 1);
        }
    }

    public static final sn.z Preview_PlayerScreen_PlayerReady_AndPlaying$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_PlayerReady_AndPlaying(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_PlayerReady_SleepTimer(u2.m mVar, int i10) {
        boolean z6;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(589703870);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            UserConfig.PlayerConfig stubPlayerConfig = UserConfigFactoryKt.stubPlayerConfig();
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, new PlayerControllerState(PlayerConnectionState.READY, null, true, null, 10, null), false, false, 100, previewHighlighterData$default(false, 1, null), null, null, false, false, false, false, new ContentState(ReadsFactoryKt.stubReadMeta$default(null, 1, null), new PlaybackPosition.Tts(0L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, new Date(1729695752L), VoicesFactoryKt.stubVoice(), null, stubPlayerConfig, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -23072831, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 25);
        }
    }

    public static final sn.z Preview_PlayerScreen_PlayerReady_SleepTimer$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_PlayerReady_SleepTimer(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    public static final void Preview_PlayerScreen_ShowsChaptersAndShare(u2.m mVar, int i10) {
        boolean z6;
        ReadMeta copy;
        u2.q qVar = (u2.q) mVar;
        qVar.Z(-264228385);
        if (i10 != 0) {
            z6 = true;
        } else {
            z6 = false;
        }
        if (qVar.O(i10 & 1, z6)) {
            UserConfig.PlayerConfig stubPlayerConfig = UserConfigFactoryKt.stubPlayerConfig();
            PlayerControllerState playerControllerState = new PlayerControllerState(PlayerConnectionState.READY, null, true, null, 10, null);
            copy = r40.copy((r84 & 1) != 0 ? r40.articleImageUrl : null, (r84 & 2) != 0 ? r40.author : null, (r84 & 4) != 0 ? r40.chapters : ReadsFactoryKt.stubChaptersList$default(0, 1, null), (r84 & 8) != 0 ? r40.charCount : 0L, (r84 & 16) != 0 ? r40.createdAt : null, (r84 & 32) != 0 ? r40.updatedAt : null, (r84 & 64) != 0 ? r40.addedAt : null, (r84 & 128) != 0 ? r40.description : null, (r84 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r40.lastListenedCharOffset : 0L, (r84 & 512) != 0 ? r40.readId : null, (r84 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r40.source : null, (r84 & 2048) != 0 ? r40.title : null, (r84 & 4096) != 0 ? r40.subtitle : null, (r84 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r40.url : null, (r84 & 16384) != 0 ? r40.wordCount : 0L, (r84 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r40.originalFileType : null, (r84 & 65536) != 0 ? r40.hasOriginalAudio : false, (r84 & 131072) != 0 ? r40.matureContent : false, (r84 & 262144) != 0 ? r40.origin : null, (r84 & 524288) != 0 ? r40.contentType : null, (r84 & 1048576) != 0 ? r40.genre : null, (r84 & 2097152) != 0 ? r40.isBookType : false, (r84 & 4194304) != 0 ? r40.fromUserImport : false, (r84 & 8388608) != 0 ? r40.rating : null, (r84 & 16777216) != 0 ? r40.userRating : null, (r84 & 33554432) != 0 ? r40.lastUsedVoiceId : null, (r84 & 67108864) != 0 ? r40.creationStatus : null, (r84 & 134217728) != 0 ? r40.creationProgress : null, (r84 & 268435456) != 0 ? r40.isArchived : false, (r84 & 536870912) != 0 ? r40.markedAsUnread : false, (r84 & 1073741824) != 0 ? r40.completedAt : null, (r84 & Integer.MIN_VALUE) != 0 ? r40.publicationDate : null, (r85 & 1) != 0 ? r40.language : null, (r85 & 2) != 0 ? r40.publisherProfileId : null, (r85 & 4) != 0 ? r40.canDelete : false, (r85 & 8) != 0 ? r40.androidProductId : null, (r85 & 16) != 0 ? r40.isPaid : false, (r85 & 32) != 0 ? r40.offlineReadData : null, (r85 & 64) != 0 ? r40.previewAudio : null, (r85 & 128) != 0 ? r40.originalVoice : null, (r85 & RpcError.MAX_MESSAGE_BYTES) != 0 ? r40.voiceSelectionConfig : null, (r85 & 512) != 0 ? r40.sampleConfig : null, (r85 & UserMetadata.MAX_ATTRIBUTE_SIZE) != 0 ? r40.displayMode : null, (r85 & 2048) != 0 ? r40.inUserLibrary : false, (r85 & 4096) != 0 ? r40.canUseAssistant : false, (r85 & UserMetadata.MAX_INTERNAL_KEY_SIZE) != 0 ? r40.audioType : null, (r85 & 16384) != 0 ? r40.useDrm : false, (r85 & PeerConnection.PORTALLOCATOR_ENABLE_ANY_ADDRESS_PORTS) != 0 ? r40.lastListenedAudioFileNumber : null, (r85 & 65536) != 0 ? r40.lastListenedAudioSeconds : null, (r85 & 131072) != 0 ? r40.audioDurationSeconds : null, (r85 & 262144) != 0 ? r40.audioTypes : null, (r85 & 524288) != 0 ? r40.isVoiceChangerOn : false, (r85 & 1048576) != 0 ? r40.lastUsedAudioType : null, (r85 & 2097152) != 0 ? r40.coverImageUrls : null, (r85 & 4194304) != 0 ? r40.coverAspectRatio : null, (r85 & 8388608) != 0 ? ReadsFactoryKt.stubReadMeta$default(null, 1, null).blurPlaceholder : null);
            PlayerScreenKt.PlayerScreenUI(ir.r.c(new PlayerState(null, playerControllerState, false, false, 100, previewHighlighterData(false), null, null, false, false, false, false, new ContentState(copy, new PlaybackPosition.Tts(0L), "default-voice", false, false, null, 56, null), null, false, null, false, null, false, false, false, null, VoicesFactoryKt.stubVoice(), null, stubPlayerConfig, false, false, false, null, false, false, false, false, false, false, false, null, new Date(1729581652L), false, null, null, null, null, null, null, false, false, false, null, null, null, null, null, false, false, 0, false, false, null, null, -20975679, 268435423, null)), null, null, null, null, null, null, null, null, null, null, false, qVar, 0, 0, 4094);
        } else {
            qVar.R();
        }
        u2.r1 r10 = qVar.r();
        if (r10 != null) {
            r10.f34012d = new io.elevenlabs.readerapp.ui.screens.authenticated.library.a0(i10, 24);
        }
    }

    public static final sn.z Preview_PlayerScreen_ShowsChaptersAndShare$lambda$0(int i10, u2.m mVar, int i11) {
        Preview_PlayerScreen_ShowsChaptersAndShare(mVar, u2.r.M(i10 | 1));
        return sn.z.f31622a;
    }

    private static final HighlighterData previewHighlighterData(boolean z6) {
        List<String> stubReadElements = ReadsFactoryKt.stubReadElements();
        return new HighlighterData(ig.f.H(new ChapterSlot(new Chapter(0, 0L, "Preview", 0L, false, 0L, null, null, 192, null), 0, stubReadElements.size(), tn.t.f33547a, 0, new ChapterContent(0, stubReadElements, tn.u.f33548a, HighlighterPositionConverter.INSTANCE.getEMPTY()))), z6, null, null, 12, null);
    }

    public static /* synthetic */ HighlighterData previewHighlighterData$default(boolean z6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z6 = true;
        }
        return previewHighlighterData(z6);
    }
}
