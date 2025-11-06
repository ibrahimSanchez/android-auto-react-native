import { Text, View } from 'react-native';
import Mapbox from '@rnmapbox/maps';
import Config from 'react-native-config';
import { styles } from '../../../styles/mapping.style';

Mapbox.setAccessToken(Config.MAPBOX_ACCESS_TOKEN ?? "");

export default function MainMapping() {
  return (
    <View style={styles.container}>

        <Text style={styles.text}>Holaaaa</Text>
      <Mapbox.MapView >
        <Mapbox.Camera
          zoomLevel={14}
          centerCoordinate={[-74.006, 40.7128]}
        />
      </Mapbox.MapView>
    </View>
  );
}
