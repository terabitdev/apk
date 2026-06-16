package io.elevenlabs.data.services;

import io.elevenlabs.data.model.ReaderSoundscape;
import io.elevenlabs.data.model.ReaderSoundscapeAudioFile;
import io.elevenlabs.domain.model.Soundscape;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import livekit.LivekitInternal$NodeStats;

/* compiled from: r8-map-id-69a07f5dcb9675c577f44413585e7422b44cd89b2b565101e801beb7a055dae0 */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0002¨\u0006\u0003"}, d2 = {"toDomain", "Lio/elevenlabs/domain/model/Soundscape;", "Lio/elevenlabs/data/model/ReaderSoundscape;", "data_release"}, k = 2, mv = {2, 3, 0}, xi = LivekitInternal$NodeStats.FORWARD_LATENCY_FIELD_NUMBER)
/* loaded from: classes3.dex */
public final class SoundscapesServiceImplKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Soundscape toDomain(ReaderSoundscape readerSoundscape) {
        ArrayList arrayList;
        Soundscape.AudioFile audioFile;
        String soundscapeId = readerSoundscape.getSoundscapeId();
        String name = readerSoundscape.getName();
        String category = readerSoundscape.getCategory();
        String mp3Url = readerSoundscape.getMp3Url();
        String mp3Checksum = readerSoundscape.getMp3Checksum();
        String iconUrl = readerSoundscape.getIconUrl();
        List<ReaderSoundscapeAudioFile> audioFiles = readerSoundscape.getAudioFiles();
        if (audioFiles != null) {
            arrayList = new ArrayList();
            for (ReaderSoundscapeAudioFile readerSoundscapeAudioFile : audioFiles) {
                String fileExtensionFromContentType = SoundscapeDownloader.INSTANCE.fileExtensionFromContentType(readerSoundscapeAudioFile.getContentType());
                if (fileExtensionFromContentType != null) {
                    audioFile = new Soundscape.AudioFile(readerSoundscapeAudioFile.getFileUrl(), readerSoundscapeAudioFile.getFileChecksum(), fileExtensionFromContentType);
                } else {
                    audioFile = null;
                }
                if (audioFile != null) {
                    arrayList.add(audioFile);
                }
            }
        } else {
            arrayList = null;
        }
        return new Soundscape(soundscapeId, name, category, mp3Url, mp3Checksum, iconUrl, arrayList);
    }
}
