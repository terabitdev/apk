package io.elevenlabs.player;

import android.content.Intent;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.os.Bundle;
import android.view.KeyEvent;
import com.google.firebase.crashlytics.internal.metadata.h;
import fr.d0;
import fr.g0;
import ib.i;
import io.elevenlabs.domain.Analytics;
import io.elevenlabs.domain.Logger;
import io.elevenlabs.domain.model.BluetoothButtonAction;
import io.elevenlabs.domain.model.ReadMeta;
import io.elevenlabs.player.BackgroundPlayerAction;
import ir.i1;
import ja.g4;
import ja.h4;
import ja.k4;
import ja.t1;
import ja.u1;
import ja.w1;
import ja.y1;
import ja.z1;
import java.io.File;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.m;
import lh.b0;
import livekit.LivekitInternal$NodeStats;
import w7.d1;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000S\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0012\u001a\u00020\u0011H\u0017¢\u0006\u0004\b\u0014\u0010\u0015J5\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"io/elevenlabs/player/BackgroundPlayerService$createMediaSessionCallback$1", "Lja/t1;", "Lja/z1;", ParameterNames.SESSION, "Lja/w1;", "controller", "Lja/u1;", "onConnect", "(Lja/z1;Lja/w1;)Lja/u1;", "mediaSession", "Llh/b0;", "Lja/x1;", "onPlaybackResumption", "(Lja/z1;Lja/w1;)Llh/b0;", "Lsn/z;", "onPostConnect", "(Lja/z1;Lja/w1;)V", "Landroid/content/Intent;", "intent", "", "onMediaButtonEvent", "(Lja/z1;Lja/w1;Landroid/content/Intent;)Z", "Lja/g4;", "customCommand", "Landroid/os/Bundle;", "args", "Lja/k4;", "onCustomCommand", "(Lja/z1;Lja/w1;Lja/g4;Landroid/os/Bundle;)Llh/b0;", "player_release"}, k = 1, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class BackgroundPlayerService$createMediaSessionCallback$1 implements t1 {
    final /* synthetic */ BackgroundPlayerService this$0;

    public BackgroundPlayerService$createMediaSessionCallback$1(BackgroundPlayerService backgroundPlayerService) {
        this.this$0 = backgroundPlayerService;
    }

    public static final long onCustomCommand$lambda$1(Long l4, ReadMeta readMeta) {
        readMeta.getClass();
        return l4.longValue();
    }

    @Override // ja.t1
    public /* bridge */ /* synthetic */ b0 onAddMediaItems(z1 z1Var, w1 w1Var, List list) {
        return super.onAddMediaItems(z1Var, w1Var, list);
    }

    @Override // ja.t1
    public u1 onConnect(z1 r72, w1 controller) {
        r72.getClass();
        controller.getClass();
        this.this$0.getLogger().log(this.this$0.tag, "MediaSession.Callback.onConnect - controller: " + controller.a() + ", connectionHints: " + new Bundle(controller.f19253e));
        u1 onConnect = super.onConnect(r72, controller);
        h4 h4Var = onConnect.f19209a;
        h4Var.getClass();
        HashSet hashSet = new HashSet(h4Var.f18932a);
        hashSet.add(new g4(new Bundle(), BackgroundPlayerAction.SleepTimer.ACTION_ID));
        Bundle bundle = Bundle.EMPTY;
        hashSet.add(new g4(bundle, BackgroundPlayerAction.SeekBack.ACTION_ID));
        hashSet.add(new g4(bundle, BackgroundPlayerAction.SeekForward.ACTION_ID));
        hashSet.add(new g4(new Bundle(), BackgroundPlayerAction.SetSoundscape.ACTION_ID));
        hashSet.add(new g4(bundle, BackgroundPlayerAction.NextChapter.ACTION_ID));
        hashSet.add(new g4(bundle, BackgroundPlayerAction.PreviousChapter.ACTION_ID));
        hashSet.add(new g4(bundle, BackgroundPlayerAction.Bookmark.ACTION_ID));
        hashSet.add(new g4(bundle, BackgroundPlayerAction.VoiceChat.ACTION_ID));
        hashSet.add(new g4(bundle, BackgroundPlayerAction.SeekToOffset.ACTION_ID));
        d1 d1Var = onConnect.f19210b;
        d1Var.getClass();
        h hVar = new h(7);
        hVar.g(d1Var.f36316a);
        hVar.b(5);
        return new u1(new h4(hashSet), new d1(hVar.o()), null, null);
    }

    @Override // ja.t1
    public b0 onCustomCommand(z1 r11, w1 controller, g4 customCommand, Bundle args) {
        i1 i1Var;
        i1 i1Var2;
        i1 i1Var3;
        r11.getClass();
        controller.getClass();
        customCommand.getClass();
        args.getClass();
        Logger logger = this.this$0.getLogger();
        String str = this.this$0.tag;
        String str2 = customCommand.f18892b;
        Bundle bundle = customCommand.f18893c;
        logger.log(str, "Custom command / action: " + str2 + " / extras: " + bundle + " / args: " + args);
        int i10 = 15;
        Date date = null;
        switch (str2.hashCode()) {
            case -1515365819:
                if (str2.equals(BackgroundPlayerAction.VoiceChat.ACTION_ID)) {
                    this.this$0.getLogger().log(this.this$0.tag, "Voice chat requested");
                    this.this$0.triggerAssistantFromMediaButton();
                    break;
                }
                break;
            case -254865410:
                if (str2.equals(BackgroundPlayerAction.SeekForward.ACTION_ID)) {
                    bundle.getClass();
                    Integer seekDurationSeconds = ExchangeKt.getSeekDurationSeconds(bundle);
                    if (seekDurationSeconds != null) {
                        i10 = seekDurationSeconds.intValue();
                    }
                    Analytics analytics = this.this$0.getAnalytics();
                    Analytics.Event.PlayerControlEventSource seekSource = ExchangeKt.getSeekSource(bundle);
                    if (seekSource == null) {
                        seekSource = Analytics.Event.PlayerControlEventSource.MediaControls;
                    }
                    analytics.log(new Analytics.Event.PlayerClickedSeekForward(seekSource));
                    this.this$0.seekBySeconds(i10);
                    break;
                }
                break;
            case 445461968:
                if (str2.equals(BackgroundPlayerAction.SeekToOffset.ACTION_ID)) {
                    bundle.getClass();
                    Long seekCharacterOffset = ExchangeKt.getSeekCharacterOffset(bundle);
                    this.this$0.getLogger().log(this.this$0.tag, "onCustomCommand SeekToOffset received / offset=" + seekCharacterOffset);
                    BackgroundPlayerService backgroundPlayerService = this.this$0;
                    if (seekCharacterOffset != null) {
                        BackgroundPlayerService.seekToTtsOffset$default(backgroundPlayerService, false, new b(seekCharacterOffset, 2), 1, null);
                        break;
                    } else {
                        Logger.logWarning$default(backgroundPlayerService.getLogger(), this.this$0.tag, "onCustomCommand SeekToOffset ignored — missing offset extra", null, 4, null);
                        break;
                    }
                }
                break;
            case 828979790:
                if (str2.equals(BackgroundPlayerAction.SeekBack.ACTION_ID)) {
                    bundle.getClass();
                    Integer seekDurationSeconds2 = ExchangeKt.getSeekDurationSeconds(bundle);
                    if (seekDurationSeconds2 != null) {
                        i10 = seekDurationSeconds2.intValue();
                    }
                    Analytics analytics2 = this.this$0.getAnalytics();
                    Analytics.Event.PlayerControlEventSource seekSource2 = ExchangeKt.getSeekSource(bundle);
                    if (seekSource2 == null) {
                        seekSource2 = Analytics.Event.PlayerControlEventSource.MediaControls;
                    }
                    analytics2.log(new Analytics.Event.PlayerClickedSeekBackward(seekSource2));
                    this.this$0.seekBySeconds(-i10);
                    break;
                }
                break;
            case 972610525:
                if (str2.equals(BackgroundPlayerAction.SleepTimer.ACTION_ID)) {
                    bundle.getClass();
                    Long sleepTimerTimestamp = ExchangeKt.getSleepTimerTimestamp(bundle);
                    if (sleepTimerTimestamp != null) {
                        date = new Date(sleepTimerTimestamp.longValue());
                    }
                    this.this$0.getLogger().log(this.this$0.tag, "Setting sleep timer with date: " + date);
                    i1Var = this.this$0.actionsFlow;
                    i1Var.tryEmit(new BackgroundPlayerAction.SleepTimer(date));
                    break;
                }
                break;
            case 978909716:
                if (str2.equals(BackgroundPlayerAction.SetSoundscape.ACTION_ID)) {
                    bundle.getClass();
                    String soundscapeId = ExchangeKt.getSoundscapeId(bundle);
                    String soundscapeFile = ExchangeKt.getSoundscapeFile(bundle);
                    Float soundscapeMixingLevel = ExchangeKt.getSoundscapeMixingLevel(bundle);
                    float f10 = 0.5f;
                    if (soundscapeId == null || soundscapeFile == null) {
                        i1Var2 = this.this$0.actionsFlow;
                        i1Var2.tryEmit(new BackgroundPlayerAction.SetSoundscape(null, null, 0.5f));
                        break;
                    } else {
                        i1Var3 = this.this$0.actionsFlow;
                        File file = new File(soundscapeFile);
                        if (soundscapeMixingLevel != null) {
                            f10 = soundscapeMixingLevel.floatValue();
                        }
                        i1Var3.tryEmit(new BackgroundPlayerAction.SetSoundscape(soundscapeId, file, f10));
                        break;
                    }
                }
                break;
            case 1885140741:
                if (str2.equals(BackgroundPlayerAction.PreviousChapter.ACTION_ID)) {
                    d0 d0Var = this.this$0.scope;
                    if (d0Var != null) {
                        g0.D(d0Var, this.this$0.getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$createMediaSessionCallback$1$onCustomCommand$2(this.this$0, null), 2);
                        break;
                    } else {
                        m.i("scope");
                        throw null;
                    }
                }
                break;
            case 1989872385:
                if (str2.equals(BackgroundPlayerAction.NextChapter.ACTION_ID)) {
                    d0 d0Var2 = this.this$0.scope;
                    if (d0Var2 != null) {
                        g0.D(d0Var2, this.this$0.getDispatcherFactory().getDefault(), null, new BackgroundPlayerService$createMediaSessionCallback$1$onCustomCommand$1(this.this$0, null), 2);
                        break;
                    } else {
                        m.i("scope");
                        throw null;
                    }
                }
                break;
            case 2005378358:
                if (str2.equals(BackgroundPlayerAction.Bookmark.ACTION_ID)) {
                    this.this$0.getLogger().log(this.this$0.tag, "Bookmark requested via media button");
                    this.this$0.createBookmarkFromMediaButton();
                    break;
                }
                break;
        }
        return android.support.v4.media.session.b.v(new k4(0));
    }

    @Override // ja.t1
    public boolean onMediaButtonEvent(z1 r10, w1 controller, Intent intent) {
        Integer num;
        int i10;
        Integer num2;
        Integer num3;
        BluetoothButtonAction bluetoothButtonAction;
        BluetoothButtonAction bluetoothButtonAction2;
        BluetoothButtonAction bluetoothButtonAction3;
        BluetoothButtonAction bluetoothButtonAction4;
        r10.getClass();
        controller.getClass();
        intent.getClass();
        KeyEvent keyEvent = (KeyEvent) intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        Logger logger = this.this$0.getLogger();
        String str = this.this$0.tag;
        String a10 = controller.a();
        Long l4 = null;
        if (keyEvent != null) {
            num = Integer.valueOf(keyEvent.getKeyCode());
        } else {
            num = null;
        }
        if (keyEvent != null) {
            i10 = keyEvent.getKeyCode();
        } else {
            i10 = 0;
        }
        String keyCodeToString = KeyEvent.keyCodeToString(i10);
        if (keyEvent != null) {
            num2 = Integer.valueOf(keyEvent.getAction());
        } else {
            num2 = null;
        }
        if (keyEvent != null) {
            num3 = Integer.valueOf(keyEvent.getRepeatCount());
        } else {
            num3 = null;
        }
        if (keyEvent != null) {
            l4 = Long.valueOf(keyEvent.getEventTime());
        }
        logger.log(str, "MediaSession.Callback.onMediaButtonEvent - controller: " + a10 + ", keyCode: " + num + " (" + keyCodeToString + "), action: " + num2 + ", repeatCount: " + num3 + ", eventTime: " + l4);
        if (keyEvent == null || keyEvent.getAction() != 0) {
            return false;
        }
        Analytics analytics = this.this$0.getAnalytics();
        int keyCode = keyEvent.getKeyCode();
        String keyCodeToString2 = KeyEvent.keyCodeToString(keyEvent.getKeyCode());
        keyCodeToString2.getClass();
        analytics.log(new Analytics.Event.PlayerPressedMediaButton(keyCode, keyCodeToString2));
        switch (keyEvent.getKeyCode()) {
            case 87:
                BackgroundPlayerService backgroundPlayerService = this.this$0;
                bluetoothButtonAction = backgroundPlayerService.cachedNextAction;
                backgroundPlayerService.executeButtonAction(bluetoothButtonAction, "NEXT");
                return true;
            case 88:
                BackgroundPlayerService backgroundPlayerService2 = this.this$0;
                bluetoothButtonAction2 = backgroundPlayerService2.cachedPreviousAction;
                backgroundPlayerService2.executeButtonAction(bluetoothButtonAction2, "PREVIOUS");
                return true;
            case 89:
                BackgroundPlayerService backgroundPlayerService3 = this.this$0;
                bluetoothButtonAction3 = backgroundPlayerService3.cachedBackAction;
                backgroundPlayerService3.executeButtonAction(bluetoothButtonAction3, "BACK");
                return true;
            case 90:
                BackgroundPlayerService backgroundPlayerService4 = this.this$0;
                bluetoothButtonAction4 = backgroundPlayerService4.cachedForwardAction;
                backgroundPlayerService4.executeButtonAction(bluetoothButtonAction4, "FORWARD");
                return true;
            default:
                return false;
        }
    }

    @Override // ja.t1
    public b0 onPlaybackResumption(z1 mediaSession, w1 controller) {
        mediaSession.getClass();
        controller.getClass();
        i.r("MediaSession.Callback.onPlaybackResumption - controller: ", controller.a(), this.this$0.getLogger(), this.this$0.tag);
        return super.onPlaybackResumption(mediaSession, controller);
    }

    @Override // ja.t1
    @Deprecated
    public /* bridge */ /* synthetic */ int onPlayerCommandRequest(z1 z1Var, w1 w1Var, int i10) {
        return 0;
    }

    @Override // ja.t1
    public void onPostConnect(z1 r32, w1 controller) {
        r32.getClass();
        controller.getClass();
        i.r("MediaSession.Callback.onPostConnect - controller: ", controller.a(), this.this$0.getLogger(), this.this$0.tag);
    }

    @Override // ja.t1
    public /* bridge */ /* synthetic */ b0 onSetMediaItems(z1 z1Var, w1 w1Var, List list, int i10, long j4) {
        return super.onSetMediaItems(z1Var, w1Var, list, i10, j4);
    }

    @Override // ja.t1
    public /* bridge */ /* synthetic */ b0 onSetRating(z1 z1Var, w1 w1Var, String str, w7.i1 i1Var) {
        return super.onSetRating(z1Var, w1Var, str, i1Var);
    }

    @Override // ja.t1
    public /* bridge */ /* synthetic */ b0 onSetRating(z1 z1Var, w1 w1Var, w7.i1 i1Var) {
        return super.onSetRating(z1Var, w1Var, i1Var);
    }

    @Override // ja.t1
    public b0 onPlaybackResumption(z1 z1Var, w1 w1Var, boolean z6) {
        return onPlaybackResumption(z1Var, w1Var);
    }

    @Override // ja.t1
    public /* bridge */ /* synthetic */ void onDisconnected(z1 z1Var, w1 w1Var) {
    }

    @Override // ja.t1
    public /* bridge */ /* synthetic */ void onPlayerInteractionFinished(z1 z1Var, w1 w1Var, d1 d1Var) {
    }

    @Override // ja.t1
    public b0 onCustomCommand(z1 z1Var, w1 w1Var, g4 g4Var, Bundle bundle, y1 y1Var) {
        return onCustomCommand(z1Var, w1Var, g4Var, bundle);
    }
}
